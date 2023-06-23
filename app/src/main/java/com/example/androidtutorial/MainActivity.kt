package com.example.androidtutorial

import android.content.ComponentName
import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var br: MyReceiver? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        br = MyReceiver()
//        val filter = IntentFilter("ACTION_1")
//        registerReceiver(br, filter, 0)
    }

    override fun onDestroy() {
        super.onDestroy()
//        unregisterReceiver(br)
    }

    fun openGetTestActivity (view: View?) {
        Log.d("TAG", "openGetTestActivity: ")
        val intent = Intent(this, Gittest::class.java)
        startActivity(intent)
    }

    fun sendTestBroadcastMain(view: View?) {
        Log.d("TAG", "sendTestBroadcastMain: ")
        val intent = Intent()
        intent.action = "ACTION_1"
//        intent.setPackage("com.example.androidtutorial")
//        val componentName = ComponentName(applicationContext, MyReceiver::class.java)
//        intent.component = componentName
        sendBroadcast(intent)
    }

}