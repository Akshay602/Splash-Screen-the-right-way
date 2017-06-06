package com.test.akshay.splashex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //no need of this  setContentView(R.layout.activity_splash);
        Intent i1 = new Intent(SplashActivity.this,MainActivity.class);
        startActivity(i1);
        finish();
    }
}
