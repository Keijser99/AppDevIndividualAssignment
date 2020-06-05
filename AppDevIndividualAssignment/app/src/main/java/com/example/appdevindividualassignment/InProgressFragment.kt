package com.example.appdevindividualassignment


import android.app.AlertDialog
import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar


class InProgressFragment : Fragment() {

    val fragmentInProgressList : ArrayList<String> = ArrayList()

    val alertMessage  = "This is a test"

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        //This lines make it able to connect this fragment with the Recyclerview
        val listItems: View = inflater.inflate(R.layout.fragment_in_progress, container, false)
        val rv_content_frag_in_progress = listItems.findViewById<View>(R.id.rv_fragment_in_progress) as RecyclerView

        rv_content_frag_in_progress.layoutManager = LinearLayoutManager(this.context)
        rv_content_frag_in_progress.adapter = InProgressAdapter(fragmentInProgressList)


        //*** AT THIS LOCATION, YOU CAN FILL THE ARRAYLIST 'fragmentInProgressList' ***//
        //floating action button to add new game to list

        val fab: View = listItems.findViewById(R.id.fabAddGame)
        fab.setOnClickListener { view ->
            //Snackbar.make(view, "Add Button clicked", Snackbar.LENGTH_LONG).setAction("Action", null).show()

            val dialogBuilder = AlertDialog.Builder(activity!!)
            dialogBuilder.setMessage(alertMessage)
                // if the dialog is cancelable
                .setCancelable(false)
                .setPositiveButton("Ok", DialogInterface.OnClickListener {
                        dialog, id ->
                    dialog.dismiss()
                })

            val alert = dialogBuilder.create()
            alert.setTitle("Test Alert")
            alert.show()

        }


        return listItems
    }
}