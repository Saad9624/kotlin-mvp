package com.mayakoba.appxone.fueluppkotlin.Presenter.interfaces

import UserObject
import android.content.Context


interface Logininterface {

    interface presenterinterface{
        fun login(userid:String, password: String, context: Context?)

    }

    interface loginviewinterface{
            fun changefragment(data : UserObject)


    }
}

