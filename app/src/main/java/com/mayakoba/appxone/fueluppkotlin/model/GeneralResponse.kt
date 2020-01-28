package com.mayakoba.appxone.fueluppkotlin.model

import com.google.gson.annotations.SerializedName

data class userinfo(

        @SerializedName("tokenNo")
        private val tokenNo: Int? ,

        @SerializedName("lastLoginOn")
        private val lastLoginOn: Int? ,

        @SerializedName("email")
        private val email: Int? ,

        @SerializedName("userName")
        private val userName: Int? ,

        @SerializedName("userId")
        private val userId: Int? ,

        @SerializedName("mobileNo")
        private val mobileNo: Int?

)