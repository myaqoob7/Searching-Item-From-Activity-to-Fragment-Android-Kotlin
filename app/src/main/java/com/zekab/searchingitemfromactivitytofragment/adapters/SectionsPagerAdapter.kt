package com.zekab.searchingitemfromactivitytofragment.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zekab.searchingitemfromactivitytofragment.R
import com.zekab.searchingitemfromactivitytofragment.fragments.BangladeshFragment
import com.zekab.searchingitemfromactivitytofragment.fragments.ChinaFragment
import com.zekab.searchingitemfromactivitytofragment.fragments.IndiaFragment
import com.zekab.searchingitemfromactivitytofragment.fragments.PakistanFragment

private val TAB_TITLES = arrayOf(
    R.string.tab_pakistan,
    R.string.tab_india,
    R.string.tab_bangladesh,
    R.string.tab_china,
)


class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {

        return when (position) {
            0 -> PakistanFragment()
            1 -> IndiaFragment()
            2 -> BangladeshFragment()
            3 -> ChinaFragment()
            else -> PakistanFragment()
        }
    }

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 4 total pages.
        return 4
    }
}