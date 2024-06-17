package app.lly.testlib

import android.content.Context
import android.widget.Toast


object YaoApp {
    fun Toast(context:Context,string: String){
        Toast.makeText(context,string,Toast.LENGTH_LONG)
    }
}