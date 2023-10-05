package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.listfragment.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    lateinit var secondBinding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        secondBinding = FragmentSecondBinding.inflate(inflater, container, false)

        secondBinding.capitalTextView.text = arguments?.getCharSequence("city")
        secondBinding.countryTextView.text = arguments?.getCharSequence("country")

        when(secondBinding.capitalTextView.text){
            "Kyiv" -> {
                secondBinding.imageView2.setImageResource(R.drawable.kyiv_city)
                secondBinding.populationTextView.text = "3.017.000"
            }
            "Berlin" -> {
                secondBinding.imageView2.setImageResource(R.drawable.berlin_city)
                secondBinding.populationTextView.text = "3.574.000"
            }
            "Tokyo" -> {
                secondBinding.imageView2.setImageResource(R.drawable.tokyo_city)
                secondBinding.populationTextView.text = "14.009.000"
            }
            "Amsterdam" -> {
                secondBinding.imageView2.setImageResource(R.drawable.amsterdam_city)
                secondBinding.populationTextView.text = "1.174.000"
            }
            "Paris" -> {
                secondBinding.imageView2.setImageResource(R.drawable.paris_city)
                secondBinding.populationTextView.text = "2.100.000"
            }
            "Copenhagen" -> {
                secondBinding.imageView2.setImageResource(R.drawable.copenhagen_city)
                secondBinding.populationTextView.text = "1.381.000"
            }
            "Rome" -> {
                secondBinding.imageView2.setImageResource(R.drawable.rome_city)
                secondBinding.populationTextView.text = "2.860.009"
            }
        }

        return secondBinding.root
    }
}