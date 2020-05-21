package com.example.appdevindividualassignment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class InProgressFragment : Fragment() {

    val fragmentInProgressList : ArrayList<String> = ArrayList()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //This lines make it able to connect this fragment with the Recyclerview
        val listItems: View = inflater.inflate(R.layout.fragment_in_progress, container, false)
        val rv_content_frag_in_progress = listItems.findViewById<View>(R.id.rv_fragment_finished) as RecyclerView

        rv_content_frag_in_progress.layoutManager = LinearLayoutManager(this.context)
        rv_content_frag_in_progress.adapter = InProgressAdapter(fragmentInProgressList)

        //*** AT THIS LOCATION, YOU CAN FILL THE ARRAYLIST 'fragmentInProgressList' ***//
        //floating action button to add new game to list

        return listItems
    }
}