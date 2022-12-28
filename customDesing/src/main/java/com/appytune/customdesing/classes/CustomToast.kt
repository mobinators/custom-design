package com.appytune.customdesing.classes

import android.content.Context
import android.widget.Toast

object CustomToast {
    fun createToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
    }
}