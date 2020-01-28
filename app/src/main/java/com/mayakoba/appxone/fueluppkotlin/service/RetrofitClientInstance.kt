package com.mayakoba.appxone.fueluppkotlin.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClientInstance {

    private var retrofit: Retrofit? = null
    private val BASE_URL = "http://172.191.1.137:8080/AGCM_PROD/AG_Servlet/"
    // private static final String BASE_URL  = "https://mcb.accessgroup.mobi/agmiddleware/AG_Servlet/" ;


    val retrofitInstance: Retrofit?
        get() {
            if (retrofit == null) {
                retrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return retrofit
        }
}
