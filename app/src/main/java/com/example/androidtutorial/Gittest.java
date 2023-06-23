package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Gittest extends AppCompatActivity {
    private EditText mOpenLink;
    private static final String TAG = "Gitttest";
    private MyReceiver br;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gittest);
        mOpenLink = findViewById(R.id.url_link);
        br = new MyReceiver();
        IntentFilter filter = new IntentFilter("ACTION_1");
        getApplicationContext().registerReceiver(br, filter, "permission_1", null);
    }

    public void webOpen(View view) {
        String urlLink = mOpenLink.getText().toString();
        Uri webpage = Uri.parse(urlLink);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d(TAG, "Open webpage fail!");
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        getApplicationContext().unregisterReceiver(br);
    }

    public void sendTestBroadcast(View view) {
        Log.d(TAG, "sendTestBroadcast: ");
        Intent intent = new Intent("ACTION_1");
//        intent.setAction();
//        intent.setPackage("com.example.androidtutorial");
//        ComponentName componentName = new ComponentName(getApplicationContext(), MyReceiver.class);
//        intent.setComponent(componentName);
        sendBroadcast(intent, "permission_1");
    }
}