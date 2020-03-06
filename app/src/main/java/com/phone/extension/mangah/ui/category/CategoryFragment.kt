package com.phone.extension.mangah.ui.category

import android.os.Bundle
import android.view.*
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.phone.extension.mangah.R
import com.phone.extension.mangah.ui.adapter.CategoryAdapter
import com.phone.extension.mangah.ui.adapter.MangaVerticalAdapter
import com.phone.extension.mangah.ui.base.BaseFragment
import org.koin.android.viewmodel.ext.android.viewModel

class CategoryFragment : BaseFragment() {


    private val mCategoryViewModel: CategoryViewModel by viewModel()
    override fun setLayout(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_category, container, false)
    }

    private lateinit var mRvCategory: RecyclerView
    private lateinit var mRvRecommend: RecyclerView
    private var mCategoryAdapter: CategoryAdapter? = null
    private var mMangaAdapter: MangaVerticalAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initToolbar(resources.getString(R.string.category), false)
        mCategoryAdapter = CategoryAdapter(context!!)
        mMangaAdapter = MangaVerticalAdapter(context!!)
        initRecyclerView(view)
    }

    private fun initRecyclerView(view: View) {
        mRvCategory = view.findViewById(R.id.rv_category)
        mRvCategory.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        mRvCategory.setHasFixedSize(true)
        mRvCategory.adapter = mCategoryAdapter


        mRvRecommend = view.findViewById(R.id.rv_recommend)
        mRvRecommend.layoutManager =
            LinearLayoutManager(context!!)
        mRvRecommend.setHasFixedSize(true)
        mRvRecommend.adapter = mMangaAdapter
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mCategoryViewModel.mListCategory.observe(viewLifecycleOwner, Observer {
            mCategoryAdapter!!.updateData(it)
        })

        mCategoryViewModel.mListSuggestion.observe(viewLifecycleOwner, Observer {
            mMangaAdapter!!.updateData(it)
        })


    }

    override fun onResume() {
        super.onResume()
        mCategoryViewModel.getListCategory()
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.search_menu, menu)
        super.onCreateOptionsMenu(menu, inflater)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return (when (item.itemId) {
            R.id.action_search -> true

            else -> super.onOptionsItemSelected(item)
        })
    }

}
