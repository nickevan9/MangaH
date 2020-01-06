package com.phone.extension.mangah.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import androidx.navigation.NavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.phone.extension.mangah.R
import com.phone.extension.mangah.utils.setupWithNavController

class MainActivity : AppCompatActivity() {

    private var currentNavController: LiveData<NavController>? = null
    private lateinit var mBottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBottomNavigationView = findViewById(R.id.bottom_nav)

        if (savedInstanceState == null) {
            setupBottomNavigationBar()
        }
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState!!)
        setupBottomNavigationBar()
    }

    private fun setupBottomNavigationBar() {

        val navGraphIds = listOf(
                R.navigation.home,
                R.navigation.category,
                R.navigation.ranking,
                R.navigation.favorite,
                R.navigation.setting
        )

        // Setup the bottom navigation view with a list of navigation graphs
        val controller = mBottomNavigationView.setupWithNavController(
                navGraphIds = navGraphIds,
                fragmentManager = supportFragmentManager,
                containerId = R.id.nav_host_container,
                intent = intent
        )

        // Whenever the selected controller changes, setup the action bar.
        controller.observe(this, Observer { navController ->

            //            setupActionBarWithNavController(navController)
            navController.addOnDestinationChangedListener { _, destination, _ ->
                when (destination.id) {
                    R.id.homeFragment -> {
                        mBottomNavigationView.visibility = View.VISIBLE
                    }
                    R.id.categoryFragment -> {
                        mBottomNavigationView.visibility = View.VISIBLE
                    }
                    R.id.rankingFragment -> {
                        mBottomNavigationView.visibility = View.VISIBLE
                    }
                    R.id.favoriteFragment -> {
                        mBottomNavigationView.visibility = View.VISIBLE
                    }
                    R.id.settingFragment -> {
                        mBottomNavigationView.visibility = View.VISIBLE
                    }
                    else -> {
                        mBottomNavigationView.visibility = View.GONE
                    }
                }
            }
        })
        currentNavController = controller
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

    override fun onDestroy() {
        super.onDestroy()
        unbindDrawables(findViewById(R.id.rootLayout));
    }
}
