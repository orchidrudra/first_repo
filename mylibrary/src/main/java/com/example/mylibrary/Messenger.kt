package com.example.mylibrary

import android.content.Context
import android.widget.Toast

object Messenger {

    fun mymessage(context: Context, message: String){
        Toast.makeText(context, message, Toast.LENGTH_LONG).show()
    }
}