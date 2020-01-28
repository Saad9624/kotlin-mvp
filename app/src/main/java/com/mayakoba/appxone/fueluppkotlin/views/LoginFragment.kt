package com.mayakoba.appxone.fueluppkotlin.views


import UserObject
import android.app.Dialog
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.mayakoba.appxone.fueluppkotlin.AppUtils.sharedpreferences
import com.mayakoba.appxone.fueluppkotlin.AppUtils.utilities
import com.mayakoba.appxone.fueluppkotlin.MainActivity
import com.mayakoba.appxone.fueluppkotlin.Presenter.LoginFragmentPresenter
import com.mayakoba.appxone.fueluppkotlin.Presenter.interfaces.Logininterface
import com.mayakoba.appxone.fueluppkotlin.R.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.delay


class LoginFragment : Fragment() , Logininterface.loginviewinterface {

    var userid: EditText? = null
    var password: EditText? = null
    lateinit var btn_next: Button
    private lateinit var progressDialog: Dialog
    val loginpresenter = LoginFragmentPresenter(this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle? ): View?
    {


        return inflater.inflate(layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        userid = view.findViewById(com.mayakoba.appxone.fueluppkotlin.R.id.userid)
        password = view.findViewById(com.mayakoba.appxone.fueluppkotlin.R.id.password)
        btn_next = view.findViewById(com.mayakoba.appxone.fueluppkotlin.R.id.btn_next)
        progressDialog =  utilities.getNaiveDialog(context , "Please wait")


        btn_next.setOnClickListener {
            val uid = userid?.text
            val passw = password!!.text
            sharedpreferences.write("user_id" , uid.toString())

            loginpresenter.login(uid.toString(), passw.toString() , context)


//            progressDialog.show()
//            if (isValid())
//            {
//               val uid = userid?.text
//               val passw = password!!.text
////                sharedpreferences.write("user_id" , uid.toString())
////
////                 loginpresenter.login(uid.toString(), passw.toString() , context)
//                 progressDialog.hide()
//            }

        }

    }

    private fun isValid() : Boolean{
        if (!userid!!.text.isEmpty() && !password!!.text.isEmpty()){
            return true
            Toast.makeText(context,"undervalid", Toast.LENGTH_SHORT).show()

        }
        Toast.makeText(context,"Please provide all fields", Toast.LENGTH_SHORT).show()
        Log.e("provide" , "provide")
        return false
    }

    override fun changefragment( data: UserObject) {
       // val fragment = Dashboard1()
        val fragment = view_transaction1()
        val bundle = Bundle()
        bundle.putSerializable("userObj" , data)
        fragment.arguments=bundle
        (activity as MainActivity).switchFragmentWithBackStack(fragment,"dashboard fragment")
    }




}
