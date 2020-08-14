package com.crisspian.rv_class

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

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
        adapter = WordAdapter()
        layoutManager = LinearLayoutManager(context)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        val fab :FloatingActionButton = view.findViewById<FloatingActionButton>(R.id.fab)
            fab.setOnClickListener {
                Toast.makeText(context, "Algo", Toast.LENGTH_LONG).show()
                adapter.updateList(listaElementosDos.toMutableList())

        }


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        adapter.updateList(listaElementos.toMutableList())



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

    private val listaElementosDos: Array<String> = arrayOf(
        "palabra 19",
        "palabra 29",
        "palabra 39",
        "palabra 49",
        "palabra 59",
        "palabra 69",
        "palabra 79",
        "palabra 89"
    )

}