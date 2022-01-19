package com.example.textmap;



import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ProfileSettingActivity extends AppCompatActivity implements View.OnClickListener {

    // 프로필 사진
    private final int Get_GALLERY_IMAGE = 200;
    private ImageView imageview;


    // 이름, 종, 소개
    public static final int REQUEST_CODE = 1000;
    private EditText mNameEditText;
    private EditText mSpeciesEditText;
    private EditText mIntroductionEditText;

    // 크기
    private RadioGroup rg_size;
    private RadioButton rb_small, rb_medium, rb_big;

    private String str_result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_setting);

        //액션바 제거
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        // 크기
        rg_size = findViewById(R.id.rg_size);
        rg_size.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { //라디오 버튼들의 상태 갑스이 변경됨을 감지
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_small){
                    rb_small = findViewById(R.id.rb_small);
                    str_result = rb_small.getText().toString();
                } else if(i == R.id.rb_medium) {
                    rb_medium = findViewById(R.id.rb_medium);
                    str_result = rb_medium.getText().toString();
                } else if (i == R.id.rb_big) {
                    rb_big = findViewById(R.id.rb_big);
                    str_result = rb_big.getText().toString();
                }
            }
        });

        // 프로필 사진 부분
        imageview = (ImageView) findViewById(R.id.imageView);
        imageview.setOnClickListener(new View.OnClickListener() {


            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setDataAndType(android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI, "image/*");
                startActivityForResult(intent, Get_GALLERY_IMAGE);

            }
        });

        // 이름, 종, 소개 부분
        mNameEditText = findViewById(R.id.name_edit);
        mSpeciesEditText = findViewById(R.id.species_edit);
        mIntroductionEditText = findViewById(R.id.introduction_edit);

        findViewById(R.id.submit_button).setOnClickListener(this);



    }


    protected void OnActivityResult(int requestCode, int resultCode, @Nullable Intent data) {

        //갤러리
        if (requestCode == Get_GALLERY_IMAGE && resultCode == RESULT_OK && data != null) {

            Uri selectedImageUri = data.getData();
            imageview.setImageURI(selectedImageUri);
            Log.d("gallery","실행되고잇니");
        }

        //입력받은 코드
        else if (requestCode == REQUEST_CODE && resultCode == RESULT_OK && data != null) {

            String result1 = data.getStringExtra("result");
            Toast.makeText(this, result1, Toast.LENGTH_SHORT).show();

        }

    }


    @Override
    public void onClick(View view) {

        Intent intent1 = new Intent(this, SecondProfileActivity.class);

        intent1.putExtra("name", mNameEditText.getText().toString());
        intent1.putExtra("species", mSpeciesEditText.getText().toString());
        intent1.putExtra("introduction", mIntroductionEditText.getText().toString());


        intent1.putExtra("size", str_result);


        startActivityForResult(intent1, REQUEST_CODE);

    }
}