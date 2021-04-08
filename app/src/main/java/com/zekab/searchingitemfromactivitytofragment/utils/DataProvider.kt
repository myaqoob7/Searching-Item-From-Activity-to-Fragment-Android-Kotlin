package com.zekab.searchingitemfromactivitytofragment.utils

import com.zekab.searchingitemfromactivitytofragment.datamodel.CountryItem


object DataProvider {

    fun getPakistanCities():List<CountryItem>{
        val pakistanCityList:ArrayList<CountryItem> = ArrayList()
        pakistanCityList.add(CountryItem("Islamabad","Pakistan"))
        pakistanCityList.add(CountryItem("Rawalpindi","Pakistan"))
        pakistanCityList.add(CountryItem("Lahore","Pakistan"))
        pakistanCityList.add(CountryItem("Faisalabad","Pakistan"))
        pakistanCityList.add(CountryItem("Karachi","Pakistan"))
        pakistanCityList.add(CountryItem("Peshawar","Pakistan"))
        pakistanCityList.add(CountryItem("Multan","Pakistan"))
        pakistanCityList.add(CountryItem("Quetta","Pakistan"))
        pakistanCityList.add(CountryItem("Bahawalpur","Pakistan"))
        pakistanCityList.add(CountryItem("Sialkot","Pakistan"))
        pakistanCityList.add(CountryItem("Rajanpur","Pakistan"))


        return pakistanCityList
    }

    fun getIndiaCities():List<CountryItem>{
        val indiaCityList:ArrayList<CountryItem> = ArrayList()
        indiaCityList.add(CountryItem("Delhi","India"))
        indiaCityList.add(CountryItem("Mumbai","India"))
        indiaCityList.add(CountryItem("Bangalore","India"))
        indiaCityList.add(CountryItem("Hyderabad","India"))
        indiaCityList.add(CountryItem("Chennai","India"))
        indiaCityList.add(CountryItem("Kolkata","India"))
        indiaCityList.add(CountryItem("Lucknow","India"))
        indiaCityList.add(CountryItem("Srinagar","India"))
        indiaCityList.add(CountryItem("Kanpur","India"))
        indiaCityList.add(CountryItem("Jaipur","India"))


        return indiaCityList
    }

    fun getBangladeshCities():List<CountryItem>{
        val bangladeshCityList:ArrayList<CountryItem> = ArrayList()
        bangladeshCityList.add(CountryItem("Dhaka","Bangladesh"))
        bangladeshCityList.add(CountryItem("Chittagong","Bangladesh"))
        bangladeshCityList.add(CountryItem("Khulna","Bangladesh"))
        bangladeshCityList.add(CountryItem("Rajshahi","Bangladesh"))
        bangladeshCityList.add(CountryItem("Gazipur","Bangladesh"))
        bangladeshCityList.add(CountryItem("Sylhet","Bangladesh"))
        bangladeshCityList.add(CountryItem("Mymensingh","Bangladesh"))
        bangladeshCityList.add(CountryItem("Barisal","Bangladesh"))
        bangladeshCityList.add(CountryItem("Rangpur","Bangladesh"))
        bangladeshCityList.add(CountryItem("Comilla","Bangladesh"))


        return bangladeshCityList
    }

    fun getChinaCities():List<CountryItem>{
        val chinaCityList:ArrayList<CountryItem> = ArrayList()
        chinaCityList.add(CountryItem("Shanghai ","China"))
        chinaCityList.add(CountryItem("Beijing  ","China"))
        chinaCityList.add(CountryItem("Tianjin  ","China"))
        chinaCityList.add(CountryItem("Shenzhen  ","China"))
        chinaCityList.add(CountryItem("Guangzhou  ","China"))
        chinaCityList.add(CountryItem("Chengdu  ","China"))
        chinaCityList.add(CountryItem("Chongqing  ","China"))
        chinaCityList.add(CountryItem("Dongguan  ","China"))
        chinaCityList.add(CountryItem("Shenyang ","China"))
        chinaCityList.add(CountryItem("Wuhan  ","China"))


        return chinaCityList
    }


}