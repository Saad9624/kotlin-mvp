package com.mayakoba.appxone.fueluppkotlin.views

import UserObject
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.mayakoba.appxone.fueluppkotlin.R

class Dashboard1 : Fragment()    {

    lateinit var username : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

         val view: View = inflater.inflate(R.layout.fragment_dashboard1, container, false)
        init(view)
        getdata()

            return  view

    }

    private fun init(view: View){
            username = view.findViewById(R.id.cardName)
    }

    private fun getdata(){

        var bunde = arguments

        var userobj: UserObject = bunde!!.getSerializable("userObj") as UserObject
        username.text = userobj.userName

        Log.e("usernameondasboard" , userobj.userName)

    }
}
