package com.mayakoba.appxone.fueluppkotlin.AppUtils

import android.app.ProgressDialog
import android.content.Context

class utilities {

    companion object{

        fun getNaiveDialog(context: Context?, message: String) : ProgressDialog{
            val dialog = ProgressDialog(context)
            dialog.setMessage(message)
            dialog.setCancelable(false)
            return dialog
        }
    }
}