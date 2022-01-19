package com.example.textmap;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class Intro1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro1);

        //액션바 제거
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Handler handler = new Handler( );
        handler.postDelayed(new Runnable( ) {
            public void run() {
                Intent intent = new Intent(Intro1.this, Intro2.class);
                startActivity(intent);
                finish( );
            }
        }, 2000);
    }

}