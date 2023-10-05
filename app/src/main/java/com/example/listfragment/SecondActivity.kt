package com.example.listfragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val cityName = intent.getStringExtra("city")
        val countryName = intent.getStringExtra("country")

        val fragmentManager: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()

        val secondFragment = SecondFragment()

        val bundle = Bundle()
        bundle.putCharSequence("city", cityName)
        bundle.putCharSequence("country", countryName)
        secondFragment.arguments = bundle

        fragmentTransaction.add(R.id.frameLayout, secondFragment).commit()
    }
}