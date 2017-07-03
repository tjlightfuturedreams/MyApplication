package com.example.lightfuture.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    private void login() {
        Intent intent=new Intent();
        intent.setClass(MainActivity.this,LoginActivity.class);
        startActivity(intent);
        finish();
    }
}
