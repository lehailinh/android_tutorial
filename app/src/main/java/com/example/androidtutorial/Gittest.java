package com.example.androidtutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Gittest extends AppCompatActivity {
    private EditText mOpenLink;
    private static final String TAG = "Gitttest";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gittest);
        mOpenLink = findViewById(R.id.url_link);
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
}