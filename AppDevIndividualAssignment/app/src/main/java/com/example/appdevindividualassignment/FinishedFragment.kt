package com.example.appdevindividualassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FinishedFragment : Fragment() {

    val fragmentFinishedList : ArrayList<String> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //This lines make it able to connect this fragment with the Recyclerview
        val listItems: View = inflater.inflate(R.layout.fragment_in_progress, container, false)
        val rv_content_frag_finished = listItems.findViewById<View>(R.id.rv_fragment_finished) as RecyclerView

        rv_content_frag_finished.layoutManager = LinearLayoutManager(this.context)
        rv_content_frag_finished.adapter = InProgressAdapter(fragmentFinishedList)

        //*** AT THIS LOCATION, YOU CAN FILL THE ARRAYLIST 'fragmentFinishedList' ***//
        //floating action button to add new game to list
        fragmentFinishedList.add("Game 1")
        fragmentFinishedList.add("Game 2")

        return listItems
    }
}