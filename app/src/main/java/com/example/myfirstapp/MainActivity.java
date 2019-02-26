package com.example.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "Error Message");
        Log.i(TAG, "Information Message");
        Log.wtf(TAG, "What a Terrible Failure Message");
        setContentView(R.layout.activity_main);
    }
}
