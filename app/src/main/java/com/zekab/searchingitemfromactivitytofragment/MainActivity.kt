package com.zekab.searchingitemfromactivitytofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.zekab.searchingitemfromactivitytofragment.adapters.SectionsPagerAdapter
import com.zekab.searchingitemfromactivitytofragment.fragments.BangladeshFragment
import com.zekab.searchingitemfromactivitytofragment.fragments.ChinaFragment
import com.zekab.searchingitemfromactivitytofragment.fragments.IndiaFragment
import com.zekab.searchingitemfromactivitytofragment.fragments.PakistanFragment

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    private lateinit var sectionsPagerAdapter: SectionsPagerAdapter
    private lateinit var etSearchText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        initListeners()

        sectionsPagerAdapter = SectionsPagerAdapter(this, supportFragmentManager)
        viewPager.adapter = sectionsPagerAdapter
        val tabs: TabLayout = findViewById(R.id.tabs)
        tabs.setupWithViewPager(viewPager)

    }

    private fun initViews(){
        viewPager = findViewById(R.id.view_pager)
        etSearchText = findViewById(R.id.etSearchText)
    }

    private fun initListeners() {
        var mPosition = 0

        viewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {

            }

            override fun onPageSelected(position: Int) {
                mPosition = position

            }

            override fun onPageScrollStateChanged(state: Int) {

            }

        })


        etSearchText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }

            override fun afterTextChanged(s: Editable) {

                when (mPosition) {
                    0 -> {
                        val pakistanFragment: PakistanFragment = sectionsPagerAdapter.instantiateItem(
                            viewPager,
                            viewPager.currentItem
                        ) as PakistanFragment
                        pakistanFragment.textFilter(s.toString())
                    }
                    1 -> {
                        val indiaFragment: IndiaFragment =
                            sectionsPagerAdapter.instantiateItem(
                                viewPager,
                                viewPager.currentItem
                            ) as IndiaFragment

                        indiaFragment.textFilter(s.toString())
                    }
                    2 -> {
                        val bangladeshFragment: BangladeshFragment =
                            sectionsPagerAdapter.instantiateItem(
                                viewPager,
                                viewPager.currentItem
                            ) as BangladeshFragment

                        bangladeshFragment.textFilter(s.toString())
                    }
                    3 -> {
                        val chinaFragment: ChinaFragment =
                            sectionsPagerAdapter.instantiateItem(
                                viewPager,
                                viewPager.currentItem
                            ) as ChinaFragment

                        chinaFragment.textFilter(s.toString())
                    }

                }

            }
        })

    }

}