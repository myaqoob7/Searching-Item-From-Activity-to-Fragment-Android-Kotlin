package com.zekab.searchingitemfromactivitytofragment.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.zekab.searchingitemfromactivitytofragment.R
import com.zekab.searchingitemfromactivitytofragment.adapters.CountryAdapter
import com.zekab.searchingitemfromactivitytofragment.datamodel.CountryItem
import com.zekab.searchingitemfromactivitytofragment.interfaces.OnCityClickListener
import com.zekab.searchingitemfromactivitytofragment.utils.DataProvider
import java.util.*
import kotlin.collections.ArrayList

class PakistanFragment : Fragment() {

    private lateinit var mAdapter: CountryAdapter
    private lateinit var recyclerView: RecyclerView
    private val originalList = DataProvider.getPakistanCities()

    override fun onCreateView(
        inflater: LayoutInflater,
        @Nullable container: ViewGroup?,
        @Nullable savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_pakistan, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        createRecyclerView(view)
    }


    private fun showMessage(message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }


    private fun createRecyclerView(view: View) {
        recyclerView = view.findViewById(R.id.recyclerview)
        mAdapter = CountryAdapter()
        recyclerView.adapter = mAdapter
        recyclerView.layoutManager = GridLayoutManager(context, 1)
        mAdapter.submitList(DataProvider.getPakistanCities())

        mAdapter.setOnItemClickListener(object : OnCityClickListener {
            override fun onItemClick(position: Int) {
                showMessage(mAdapter.currentList[position].cityName)
            }

        })

    }

    fun textFilter(searchText: String) {
        val filteredList = ArrayList<CountryItem>()

        for (item in originalList) {
            if (item.cityName.toLowerCase(Locale.ROOT).contains(searchText.toLowerCase(Locale.ROOT))) {
                filteredList.add(item)
            }
        }
        mAdapter.submitList(filteredList)
    }


}