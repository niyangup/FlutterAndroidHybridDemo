package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivity;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        System.out.println("=====");
        System.out.println("this is MainActivity onCreate");
        System.out.println("=====");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTest = findViewById(R.id.btn_test);

        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                startActivity(
//                        FlutterActivity.createDefaultIntent(MainActivity.this)
//                );
                startActivity(new Intent(MainActivity.this,SecondActivity.class)

//                        FlutterActivity
//                                .withCachedEngine("my_engine_id")
//                                .build(MainActivity.this)
                );
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("=====");
        System.out.println("this is MainActivity onPause");
        System.out.println("=====");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("=====");
        System.out.println("this is MainActivity onResume");
        System.out.println("=====");
    }
}