package com.example.textmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class communityActivity extends AppCompatActivity implements  View.OnClickListener  {


    // 장소, 설명, 경도, 위도
    public static final int REQUEST_CODE = 1000;
    private EditText dplace;
    private EditText dexplain;
    private EditText dlongitude;
    private EditText dlatitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_community);

    // 장소, 설명, 경도 , 위도
        dplace = findViewById(R.id.place);
        dexplain = findViewById(R.id.explain);
        dlongitude = findViewById(R.id.longitude);
        dlatitude = findViewById(R.id.latitude);

        //intent 로 전달

        ImageButton moveButton=(ImageButton)findViewById(R.id.btn_save);
        moveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String temp = dplace.getText().toString();
                String temp2 = dexplain.getText().toString();
                String temp3 = dlongitude.getText().toString();
                String temp4 = dlatitude.getText().toString();

                Intent intent= new Intent(getApplicationContext(),SecondCommunityActivity.class);
                intent.putExtra("place", temp);
                intent.putExtra("explain", temp2);
                intent.putExtra("longitude", temp3);
                intent.putExtra("latitude", temp4);

                startActivity(intent);
            }
        });
    }


    public void onClick(View view)
    {

        finish();
    }




}