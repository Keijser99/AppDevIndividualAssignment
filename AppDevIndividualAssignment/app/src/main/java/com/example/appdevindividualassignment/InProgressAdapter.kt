package com.example.appdevindividualassignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InProgressAdapter(val in_progress_fragment : ArrayList<String>) : RecyclerView.Adapter<InProgressAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.fragment_in_progress_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = in_progress_fragment.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.firstValue.text = in_progress_fragment[position]
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val firstValue: TextView = itemView.findViewById(R.id.firstValue)
    }
}
