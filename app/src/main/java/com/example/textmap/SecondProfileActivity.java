package com.example.textmap;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondProfileActivity extends AppCompatActivity implements View.OnClickListener {

    // 입력받은 메세지를 받을 변수
    private TextView mMessageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_profile);

        //액션바 제거
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Intent intent = getIntent();

        String name = intent.getStringExtra("name");
        String species = intent.getStringExtra("species");
        String introduction = intent.getStringExtra("introduction");

        String size = intent.getStringExtra("size");

        mMessageTextView = findViewById(R.id.message_edit_text_name);
        mMessageTextView.setText(name);

        mMessageTextView = findViewById(R.id.message_edit_text_kind);
        mMessageTextView.setText(species);

        mMessageTextView = findViewById(R.id.message_edit_text_ch);
        mMessageTextView.setText(introduction);

        mMessageTextView = findViewById(R.id.message_edit_text_size);
        mMessageTextView.setText(size);


        findViewById(R.id.result_button).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent2 = new Intent( );
        intent2.putExtra( "result", mMessageTextView.getText().toString() );

        setResult(RESULT_OK, intent2);

        finish();
    }
}