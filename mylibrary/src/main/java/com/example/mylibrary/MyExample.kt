package com.example.mylibrary

import android.content.Context
import android.widget.Toast

open class MyExample {

    companion object {
        fun msg(context: Context, message: String){
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        }
    }
}