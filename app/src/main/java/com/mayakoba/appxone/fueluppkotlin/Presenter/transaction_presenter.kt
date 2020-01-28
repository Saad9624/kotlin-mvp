package com.mayakoba.appxone.fueluppkotlin.Presenter

import Json4Kotlin_Base
import android.app.Dialog
import android.content.Context
import android.util.Log
import com.mayakoba.appxone.fueluppkotlin.AppUtils.sharedpreferences
import com.mayakoba.appxone.fueluppkotlin.AppUtils.utilities
import com.mayakoba.appxone.fueluppkotlin.Presenter.interfaces.transaction_interface
import com.mayakoba.appxone.fueluppkotlin.service.GetDataService
import com.mayakoba.appxone.fueluppkotlin.service.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Response
import java.lang.Exception

class transaction_presenter
 {
     private var lvp: transaction_interface


    constructor(lvp: transaction_interface) {
        this.lvp = lvp
    }

    private lateinit var progressDialog: Dialog
    lateinit var msisd :String
    lateinit var imei :String
    lateinit var cardnum :String
    lateinit var token :String



     fun view_transaction(context: Context) {

            msisd   = sharedpreferences.read("msisdn")
            imei    = sharedpreferences.read("imei")
            cardnum = sharedpreferences.read("cardnum")
            token   = sharedpreferences.read("token")
            Log.e("msisd" ,msisd )
            Log.e("imei" , imei)
            Log.e("cardnum" , cardnum)
            Log.e("token" , token)


            progressDialog = utilities.getNaiveDialog(context , "Please wait")
            progressDialog.show()

            val service = RetrofitClientInstance.retrofitInstance?.create(GetDataService::class.java)

         try{
             service?.viewtransaction(
                 "MINISTATEMENT_FUEL" ,
                 msisd ,
                 imei ,
                 cardnum ,
                 msisd ,
                 token ,
                 "Mobile"
             )?.enqueue(object  : retrofit2.Callback<Json4Kotlin_Base> {
                 override fun onFailure(call: Call<Json4Kotlin_Base>, t: Throwable) {
                     progressDialog.hide()
                     Log.e("transaction_failure" , t.toString())
                 }

                 override fun onResponse( call: Call<Json4Kotlin_Base>, response: Response<Json4Kotlin_Base> ) {
                     progressDialog.hide()
                     lvp.getministatmentdata(response.body()?.additonalData?.ministatement!!)
                     Log.e("transaction_success" , response.body().toString())
                 }

             })
         }
         catch(e: Exception){
                Log.e("error"  , e.toString())
         }
    }
}