package com.example.listfragment

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class CountriesAdapter(
    var cities: ArrayList<String>,
    var countries: ArrayList<String>,
    var image: ArrayList<Int>,
    var context: Context) :
    RecyclerView.Adapter<CountriesAdapter.CountryViewHolder>() {

    class CountryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cityName: TextView = itemView.findViewById(R.id.cityName)
        var countryName: TextView = itemView.findViewById(R.id.countryName)
        var imageView : CircleImageView = itemView.findViewById(R.id.imageView)
        var cardView : CardView = itemView.findViewById(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_design, parent, false)

        return CountryViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cities.size
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        holder.cityName.text = cities[position]
        holder.countryName.text = countries[position]
        holder.imageView.setImageResource(image[position])
        holder.cardView.setOnClickListener {
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra("city", cities[position])
            intent.putExtra("country", countries[position])
            context.startActivity(intent)
        }
    }
}