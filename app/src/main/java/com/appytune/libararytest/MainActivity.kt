package com.appytune.libararytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.appytune.customdesing.classes.CustomToast

class MainActivity : AppCompatActivity() {
    private lateinit var toastButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toastButton=this.findViewById(R.id.toastButton)
        toastButton.setOnClickListener {
            CustomToast.createToast(this,"Custom Toast")
        }
    }
}