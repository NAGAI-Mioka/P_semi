package com.example.thirdtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.content.Intent

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId) {
            R.id.button2 -> {
                val intent = Intent(applicationContext, SubActivity1::class.java)
                startActivity(intent)
            }
        }

        return super.onOptionsItemSelected(item)
    }
}