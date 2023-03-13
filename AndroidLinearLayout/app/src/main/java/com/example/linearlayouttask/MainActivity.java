package com.example.linearlayouttask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("onStart", "onStart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("onResume", "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("onPause", "onPause: ");
    }

    protected void onStop() {
        super.onStop();
        Log.e("onStop", "onStop: ");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.e("onDestroy", "onDestroy: ");
    }

    protected void onRestart() {
        super.onRestart();
        Log.e("onRestart", "onRestart: ");
    }
}