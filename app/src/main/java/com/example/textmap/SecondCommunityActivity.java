package com.example.textmap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class SecondCommunityActivity extends AppCompatActivity implements OnMapReadyCallback, View.OnClickListener {

    private GoogleMap mMap;
    private TextView mMessageTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_community);

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);



        Intent intent = getIntent();

        String place = intent.getStringExtra("place");
        String explain = intent.getStringExtra("explain");


        mMessageTextView = findViewById(R.id.edit_place);
        mMessageTextView.setText(place);

        mMessageTextView = findViewById(R.id.edit_explain);
        mMessageTextView.setText(explain);



    }

    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        if(mMap!= null){
            //지도 확대 축소 버튼 생성
            mMap.getUiSettings().setZoomControlsEnabled(true);
        }

        Intent intent2 = getIntent();


        String place = intent2.getStringExtra("place");
        String longitude = intent2.getStringExtra("longitude");
        String latitude = intent2.getStringExtra("latitude");

        System.out.println(Double.parseDouble(latitude));

        LatLng gps= new LatLng(37.566350542735776, 126.91982338226451);
        mMap.addMarker(new MarkerOptions().position(gps).title(place));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(gps,14));



    }

    public void onClick(View view)
    {

        finish();
    }

}