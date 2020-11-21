package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;

import io.flutter.embedding.android.FlutterActivity;

public class SecondActivity extends FlutterActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "this is secondactivity", Toast.LENGTH_LONG).show();
    }


    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("=====");
        System.out.println("this is SecondActivity onPause");
        System.out.println("=====");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("=====");
        System.out.println("this is SecondActivity onResume");
        System.out.println("=====");
    }
}