package com.crisspian.rv_class

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.word_item_list.view.*

class WordAdapter() :
    RecyclerView.Adapter<WordAdapter.WordViewHolder>() {

    lateinit var listadoPalabras:MutableList<String>

    class WordViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Este es un camino
        var textView : TextView = itemView.findViewById(R.id.word_text)
        // Este es otro camino Lo de abajo es lo mismo pero en Kotlin synthetic
        // var textView1 : TextView = itemView.word_text
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.word_item_list, parent, false)
        return WordViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listadoPalabras.size
    }

    fun updateList(list: MutableList<String>) {
        listadoPalabras = list
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: WordViewHolder, position: Int) {
        holder.textView.text = listadoPalabras[position]
    }

}