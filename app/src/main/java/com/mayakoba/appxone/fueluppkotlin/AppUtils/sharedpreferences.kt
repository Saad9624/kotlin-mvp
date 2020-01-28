package com.mayakoba.appxone.fueluppkotlin.AppUtils

import android.app.Activity
import android.content.Context
import android.content.SharedPreferences

object sharedpreferences {

    private lateinit var mSharedpref  :SharedPreferences

    fun init(context: Context){
        mSharedpref = context.getSharedPreferences(context.packageName, Activity.MODE_PRIVATE)
    }

    fun read(key :String) :String{
        return mSharedpref.getString(key , "")
    }

    fun write(key: String, value: String) {
        val prefsEditor = mSharedpref.edit()
        prefsEditor.putString(key, value)
        prefsEditor.apply()
    }
}