package com.mayakoba.appxone.fueluppkotlin.service

import AdditonalData
import Json4Kotlin_Base
import Ministatement
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {

    @GET("FUEL")
   fun login(
        @Query("messageType") messageType :String ,
        @Query("identity") identity: String,
        @Query("imei") imei: String,
        @Query("channel") channel: String,
        @Query("password") password: String,
        @Query("userId") userId: String

    ) : Call<Json4Kotlin_Base>


    @GET("FUEL")
    fun viewtransaction(
        @Query("messageType") messageType:String,
        @Query("msisdn" ) msisdn: String,
        @Query("imei") imei: String,
        @Query("cardNo") cardNo: String,
        @Query("identity") identity:String,
        @Query("tokenNo") tokenNo: String ,
        @Query("channel")channel:String
    ): Call<Json4Kotlin_Base>

}