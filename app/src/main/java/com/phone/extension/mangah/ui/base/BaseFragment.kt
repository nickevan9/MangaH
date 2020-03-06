package com.phone.extension.mangah.ui.base

import android.Manifest
import android.app.Activity
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView

import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.karumi.dexter.Dexter
import com.karumi.dexter.MultiplePermissionsReport
import com.karumi.dexter.PermissionToken
import com.karumi.dexter.listener.PermissionRequest
import com.karumi.dexter.listener.multi.MultiplePermissionsListener
import com.phone.extension.mangah.R
import com.phone.extension.mangah.data.pref.PrefManager
import kotlinx.android.synthetic.main.appbar_layout.*
import kotlinx.android.synthetic.main.process_bar.*


import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch

abstract class BaseFragment : Fragment(), View.OnClickListener {
    val mHandlerLeak = Handler()

    var mPreferencesManager: PrefManager? = null
    val mIOScope = CoroutineScope(Dispatchers.IO)

    abstract fun setLayout(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        requestExternalPermission()
        mIOScope.launch { mPreferencesManager = PrefManager() }
        activity!!.window.clearFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)
        activity!!.window.clearFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN)
        return setLayout(inflater, container, savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (toolbar != null) {
            (activity as AppCompatActivity?)!!.setSupportActionBar(toolbar)
        }

    }


    fun initToolbar(title: String, isBackPressed: Boolean) {
        toolbar.title = title

        if (isBackPressed) {
            (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayShowHomeEnabled(true)

            toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
            toolbar.setNavigationOnClickListener {
                activity!!.onBackPressed()
            }
        }

    }

    fun showLoading() {
        progressBar.visibility = View.VISIBLE
    }

    fun hideLoading() {
        progressBar.visibility = View.GONE
    }

    fun showKeyboard() {
        val inputMethodManager: InputMethodManager =
            context!!.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0)
    }

    private fun hideKeyboard(ctx: Context) {
        val inputManager = ctx
            .getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

        // check if no view has focus:
        val v = (ctx as Activity).currentFocus ?: return

        inputManager.hideSoftInputFromWindow(v.windowToken, 0)
    }


    override fun onDestroyView() {
        super.onDestroyView()
        hideKeyboard(context!!)
        mIOScope.cancel()
        mHandlerLeak.removeCallbacksAndMessages(null)
        unbindDrawables(view!!)
    }

    override fun onPause() {
        super.onPause()
    }

    private fun unbindDrawables(view: View) {
        if (view.background != null) {
            view.background.callback = null
        }
        if (view is ViewGroup && view !is AdapterView<*>) {
            for (i in 0 until view.childCount) {
                unbindDrawables(view.getChildAt(i))
            }
            view.removeAllViews()
        }
    }


    override fun onClick(v: View?) {
        when (v!!.id) {

        }
    }

    override fun onResume() {
        super.onResume()
    }

    private fun requestExternalPermission() {

        Dexter.withActivity(activity!!).withPermissions(
            Manifest.permission.ACCESS_FINE_LOCATION
        ).withListener(object : MultiplePermissionsListener {
            override fun onPermissionsChecked(report: MultiplePermissionsReport?) {
                if (report!!.areAllPermissionsGranted()) {

                }
            }

            override fun onPermissionRationaleShouldBeShown(
                permissions: MutableList<PermissionRequest>?,
                token: PermissionToken?
            ) {
                token!!.continuePermissionRequest()
                Toast.makeText(context, "hasDenied", Toast.LENGTH_LONG).show()
            }
        }).withErrorListener { error ->
            Toast.makeText(
                context!!,
                "Error occurred! $error",
                Toast.LENGTH_SHORT
            ).show()
        }
            .onSameThread()
            .check()
    }
}