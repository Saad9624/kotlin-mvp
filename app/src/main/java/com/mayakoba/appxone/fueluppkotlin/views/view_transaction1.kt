package com.mayakoba.appxone.fueluppkotlin.views


import Ministatement
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.mayakoba.appxone.fueluppkotlin.Adapters.CustomAdapter
import com.mayakoba.appxone.fueluppkotlin.Presenter.interfaces.transaction_interface
import com.mayakoba.appxone.fueluppkotlin.Presenter.transaction_presenter

import com.mayakoba.appxone.fueluppkotlin.R


class view_transaction1 : Fragment(), transaction_interface {


    val transactionPresenter =  transaction_presenter(this)

    lateinit var recyclerView : RecyclerView
    lateinit var linearLayoutManager: LinearLayoutManager
    lateinit var adapter : CustomAdapter
    lateinit var transactionList : List<Ministatement>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        context?.let { transactionPresenter.view_transaction(it) }

        return inflater.inflate(R.layout.fragment_view_transaction, container, false)
    }

    override fun getministatmentdata(ministatement: List<Ministatement> ) {
        generateDataList(ministatement)
    }

    private fun generateDataList(photoList: List<Ministatement>?) {
        recyclerView = view!!.findViewById(R.id.transactionList)
        adapter = CustomAdapter(this!!.context!!, photoList!!)
        linearLayoutManager= LinearLayoutManager(context)
        recyclerView.layoutManager = linearLayoutManager
        recyclerView.adapter = adapter
    }
}
