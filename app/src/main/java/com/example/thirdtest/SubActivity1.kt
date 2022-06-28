package com.example.thirdtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class SubActivity1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)
    }

    fun onBackButtonClick(view: View) {
        finish()
    }
}