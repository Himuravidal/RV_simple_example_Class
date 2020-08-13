package com.crisspian.rv_class

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: WordAdapter
    private lateinit var layoutManager: RecyclerView.LayoutManager

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_first, container, false)

        recyclerView = view.findViewById(R.id.recycler_view)
        adapter = WordAdapter(listaElementos.toMutableList())
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }


    }


    private val listaElementos: Array<String> = arrayOf(
            "palabra 1",
            "palabra 2",
            "palabra 3",
            "palabra 4",
            "palabra 5",
            "palabra 6",
            "palabra 7",
            "palabra 8"
    )



}