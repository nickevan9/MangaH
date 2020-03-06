package com.phone.extension.mangah.ui.home

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.facebook.shimmer.ShimmerFrameLayout
import com.phone.extension.mangah.R
import com.phone.extension.mangah.ui.adapter.RVHomeAdapter
import com.phone.extension.mangah.ui.adapter.SliderAdapter
import com.phone.extension.mangah.ui.base.BaseFragment
import com.smarteist.autoimageslider.IndicatorAnimations
import com.smarteist.autoimageslider.SliderAnimations
import com.smarteist.autoimageslider.SliderView
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.android.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment(), SwipeRefreshLayout.OnRefreshListener {

    override fun setLayout(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    private val mHomeViewModel: HomeViewModel by viewModel()
    private var mSliderAdapter: SliderAdapter? = null
    private var mRVHomeAdapter: RVHomeAdapter? = null

    private lateinit var mSliderView: SliderView
    private lateinit var mRvHome: RecyclerView
    private lateinit var mShimmerFrameLayout: ShimmerFrameLayout
    private lateinit var mSwipeRefreshLayout: SwipeRefreshLayout


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mSliderAdapter = SliderAdapter(context!!)
        mRVHomeAdapter = RVHomeAdapter(context!!)

        initSlideView(view)
        initRecyclerView(view)
        initShimmer(view)


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mHomeViewModel.mListManga.observe(viewLifecycleOwner, Observer {
            mRVHomeAdapter!!.updateData(it)
        })

        mHomeViewModel.mListTitle.observe(viewLifecycleOwner, Observer {
            mSliderAdapter!!.updateData(it)
        })

        mHomeViewModel.showLoading.observe(viewLifecycleOwner, Observer {
            if (it) {
                mShimmerFrameLayout.startShimmerAnimation()
            } else {
                mShimmerFrameLayout.stopShimmerAnimation()
                mShimmerFrameLayout.visibility = View.GONE
                mRvHome.visibility = View.VISIBLE
                cardView.visibility = View.VISIBLE
                mSwipeRefreshLayout.isRefreshing = false
            }

        })
    }

    private fun initRecyclerView(view: View) {
        mRvHome = view.findViewById(R.id.rv_home)
        mRvHome.setHasFixedSize(true)
        mRvHome.layoutManager = LinearLayoutManager(context!!)
        mRvHome.adapter = mRVHomeAdapter
    }

    private fun initSlideView(view: View) {
        mSliderView = view.findViewById(R.id.slider_view)
        mSliderView.sliderAdapter = mSliderAdapter
        mSliderView.setIndicatorAnimation(IndicatorAnimations.SLIDE) //set indicator animation by using SliderLayout.IndicatorAnimations. :WORM or THIN_WORM or COLOR or DROP or FILL or NONE or SCALE or SCALE_DOWN or SLIDE and SWAP!!
        mSliderView.setSliderTransformAnimation(SliderAnimations.CUBEINROTATIONTRANSFORMATION)
        mSliderView.autoCycleDirection = SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH
        mSliderView.indicatorSelectedColor = Color.WHITE
        mSliderView.indicatorUnselectedColor = Color.GRAY
        mSliderView.scrollTimeInSec = 2
        mSliderView.startAutoCycle()
        mSliderView.setOnIndicatorClickListener { position ->
            mSliderView.currentPagePosition = position
        }
    }

    private fun initShimmer(view: View) {
        mShimmerFrameLayout = view.findViewById(R.id.shimmer_view_container)
        mSwipeRefreshLayout = view.findViewById(R.id.swp_home)
        mShimmerFrameLayout.isAutoStart = true
        mSwipeRefreshLayout.setOnRefreshListener(this)
    }


    override fun onResume() {
        super.onResume()
        mHomeViewModel.getListManga()
    }

    override fun onPause() {
        super.onPause()
        mShimmerFrameLayout.stopShimmerAnimation()
        mSwipeRefreshLayout.isRefreshing = false
    }

    override fun onRefresh() {
        mHomeViewModel.getListManga()
    }


}
