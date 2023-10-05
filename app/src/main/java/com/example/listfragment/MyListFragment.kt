package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.listfragment.databinding.FragmentMyListBinding

class MyListFragment : Fragment() {
    lateinit var myListBinding: FragmentMyListBinding
    private var citiesList = ArrayList<String>()
    private var countriesList = ArrayList<String>()
    private var imageList = arrayListOf<Int>()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        myListBinding = FragmentMyListBinding.inflate(inflater, container, false)
        return myListBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val cities: Array<String> = context?.resources!!.getStringArray(R.array.cities)
        val countries: Array<String> = context?.resources!!.getStringArray(R.array.countries)
        citiesList.addAll(cities)
        countriesList.addAll(countries)
        imageList.addAll(listOf(R.drawable.ukraine, R.drawable.germany,R.drawable.japan,
            R.drawable.netherlands, R.drawable.france, R.drawable.denmark, R.drawable.italy))


        val arrayAdapter = context?.let {
            CountriesAdapter(citiesList, countriesList, imageList, it)
        }

        myListBinding.list.adapter = arrayAdapter
    }
}