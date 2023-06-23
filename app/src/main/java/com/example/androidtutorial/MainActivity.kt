package com.example.androidtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun openGetTestActivity (view: View?) {
        Log.d("TAG", "openGetTestActivity: ")
        val intent = Intent(this, Gittest::class.java)
        startActivity(intent)
    }

}