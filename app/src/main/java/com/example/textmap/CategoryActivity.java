package com.example.textmap;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        //액션바 제거
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //카테고리 버튼 눌렀을때
        ImageButton moveButton=(ImageButton)findViewById(R.id.category);
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });

        //프로필 설정 버튼 눌렀을때
        ImageButton moveButton2=(ImageButton)findViewById(R.id.profileSet);
        moveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),ProfileSettingActivity.class);
                startActivity(intent);
            }
        });

        //다이어리 버튼 눌렀을때
        ImageButton moveButton3=(ImageButton)findViewById(R.id.community);
        moveButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),communityActivity.class);
                startActivity(intent);
            }
        });

    }
}