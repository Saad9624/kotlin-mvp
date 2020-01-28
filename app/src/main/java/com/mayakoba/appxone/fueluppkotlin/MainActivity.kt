package com.mayakoba.appxone.fueluppkotlin


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.mayakoba.appxone.fueluppkotlin.AppUtils.sharedpreferences
import com.mayakoba.appxone.fueluppkotlin.views.LoginFragment


class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager

    var userid : EditText? = null
    var password : EditText? = null
    lateinit var btn_next : Button

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedpreferences.init(applicationContext)
        fragmentManager = supportFragmentManager
        switchFragment(LoginFragment(), "Login Fragment")

    }

     fun switchFragmentWithBackStack(fragment: Fragment, tag: String) {
        fragmentManager.beginTransaction().replace(R.id.main_activity_container, fragment, tag)
            .addToBackStack(null).commitAllowingStateLoss()
    }

    fun switchFragment(fragment: LoginFragment, tag: String) {

        fragmentManager.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)
        fragmentManager.beginTransaction().replace(R.id.main_activity_container, fragment, tag)
            .commitAllowingStateLoss()
    }
}
