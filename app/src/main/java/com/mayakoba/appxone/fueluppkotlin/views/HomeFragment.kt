package com.mayakoba.appxone.fueluppkotlin.views


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.mayakoba.appxone.fueluppkotlin.R

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

            val view: View =  inflater.inflate(R.layout.fragment_home, container, false)

            return view


    }


}
