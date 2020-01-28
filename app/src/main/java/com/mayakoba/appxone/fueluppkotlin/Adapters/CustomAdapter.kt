package com.mayakoba.appxone.fueluppkotlin.Adapters

import Ministatement
import android.content.Context
import android.util.Log

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

import com.mayakoba.appxone.fueluppkotlin.R


class CustomAdapter(private val context: Context, private val dataList: List<Ministatement>) :
    RecyclerView.Adapter<CustomAdapter.CustomViewHolder>() {

    inner class CustomViewHolder(mView: View) :
        RecyclerView.ViewHolder(mView) {

        var txtTitle: TextView
        var txnDate: TextView
        var merchantName: TextView
        var merchantLocator: TextView
        var rrn: TextView
        var txnAmount: TextView
        init {

            txtTitle = mView.findViewById(R.id.txnTime)
            txnDate = mView.findViewById(R.id.txnTime)
            merchantName = mView.findViewById(R.id.merchantName)
            merchantLocator = mView.findViewById(R.id.merchantLocator)
            rrn = mView.findViewById(R.id.rrn)
            txnAmount = mView.findViewById(R.id.txnAmount)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.transaction_item, parent, false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        Log.e("txnamount" , dataList[position].txnAmount)
        holder.merchantName.text = dataList[position].txnAmount
        holder.txtTitle.text = dataList[position].txnTime.toString()
        holder.txnDate.text = dataList[position].txnDate.toString()
        holder.merchantName.text = dataList[position].merchantName
        holder.merchantLocator.text = dataList[position].prevRetRef
        holder.rrn.text = dataList[position].invNo.toString()
        holder.txnAmount.text = dataList[position].txnAmount

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
