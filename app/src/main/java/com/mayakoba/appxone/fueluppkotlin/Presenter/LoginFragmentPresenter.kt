package com.mayakoba.appxone.fueluppkotlin.Presenter

import CardProfile
import Json4Kotlin_Base
import UserObject
import android.app.Dialog
import android.content.Context
import android.util.Log
import com.mayakoba.appxone.fueluppkotlin.AppUtils.sharedpreferences
import com.mayakoba.appxone.fueluppkotlin.AppUtils.utilities
import com.mayakoba.appxone.fueluppkotlin.Presenter.interfaces.Logininterface
import com.mayakoba.appxone.fueluppkotlin.service.GetDataService
import com.mayakoba.appxone.fueluppkotlin.service.RetrofitClientInstance
import retrofit2.Call
import retrofit2.Response

class LoginFragmentPresenter : Logininterface.presenterinterface
{

    private var lvp: Logininterface.loginviewinterface
    private lateinit var progressDialog: Dialog


    constructor(lvp: Logininterface.loginviewinterface)
    {
     this.lvp = lvp
    }

    override fun login(userid: String, password: String, context: Context?)  {

    progressDialog = utilities.getNaiveDialog(context , "Please wait")
        progressDialog.show()

        val service = RetrofitClientInstance.retrofitInstance?.create(GetDataService::class.java)
        service?.login("LOGIN_FUEL" ,
            "saad96",
            "09090909" ,
            "Mobile" ,
            "12345678",
            "saad96"

        )?.enqueue(object : retrofit2.Callback<Json4Kotlin_Base> {
            override fun onFailure(call: Call<Json4Kotlin_Base>, t: Throwable) {
                progressDialog.hide()
                Log.e("_login_failure" , t.toString())
            }

            override fun onResponse  (call: Call<Json4Kotlin_Base>, response: Response<Json4Kotlin_Base>) {
                progressDialog.hide()
                Log.e("response" , response.body().toString())



                if(response.code() == 200){

                    val UserObject : UserObject? = response.body()?.additonalData?.userObject


                    Log.e("userobject" , UserObject.toString())

                    sharedpreferences.write("token" ,
                        response.body()?.additonalData?.userObject?.tokenNo.toString()
                    )

                    sharedpreferences.write("msisdn" ,
                        response.body()?.additonalData?.userObject?.mobileNo.toString()
                    )

                    sharedpreferences.write("cardnum" ,"8096160900000043")

                    sharedpreferences.write("imei" ,
                        response.body()?.additonalData?.userObject?.imei.toString()
                    )

                    lvp.changefragment(UserObject!!)


                }
            }
        })
        }


}