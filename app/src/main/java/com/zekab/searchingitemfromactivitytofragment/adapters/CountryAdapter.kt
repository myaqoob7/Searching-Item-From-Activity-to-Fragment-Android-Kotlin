package com.zekab.searchingitemfromactivitytofragment.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.zekab.searchingitemfromactivitytofragment.R
import com.zekab.searchingitemfromactivitytofragment.datamodel.CountryItem
import com.zekab.searchingitemfromactivitytofragment.interfaces.OnCityClickListener


class CountryAdapter:ListAdapter<CountryItem, CountryAdapter.CountryViewHolder>(DATA_COMPARATOR) {

    private var mListener: OnCityClickListener? = null

    fun setOnItemClickListener(listener: OnCityClickListener) {
        mListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_country, parent, false)
        return CountryViewHolder(view,mListener!!)

    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current.cityName)
    }


    class CountryViewHolder(itemView: View, listener: OnCityClickListener) : RecyclerView.ViewHolder(itemView) {
        private val cityName: TextView = itemView.findViewById(R.id.cityName)

        init {

            itemView.setOnClickListener{
                val mPosition = adapterPosition
                listener.onItemClick(mPosition)
            }

        }

        fun bind(mCityName: String) {
            cityName.text = mCityName
        }

    }


    companion object {
        private val DATA_COMPARATOR = object : DiffUtil.ItemCallback<CountryItem>() {
            override fun areItemsTheSame(oldItem: CountryItem, newItem: CountryItem): Boolean {
                return oldItem.cityName == newItem.cityName
            }

            override fun areContentsTheSame(oldItem: CountryItem, newItem: CountryItem): Boolean {
                return oldItem==newItem
            }
        }
    }

}