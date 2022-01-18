package com.example.textmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MapsActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.btn_cafe);
        Button btn3 = (Button) findViewById(R.id.button3);

        btn1.setOnClickListener(new OnClickListener() {
            @Override

            public void onClick(View v) {
                gogoMap(37.566351, 126.946914,"이화여대"); // 이화여대

            }
        });



        btn2.setOnClickListener(new OnClickListener() {


            @Override
            public void onClick(View v) {
                gogoMap(37.509113, 126.891679,"신도림역"); // 신도림역
                gogoMap(37.50473994930677,  126.93529864186772,"댕과댕빵"); // 댕과댕빵

            }

        });


        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                gogoMap(37.554768, 126.970707,"서울역"); // 서울역

            }

        });

    }

    public void gogoMap(double latitude, double longitude,String title) {

        LatLng place= new LatLng(latitude, longitude);
        mMap.addMarker(new MarkerOptions().position(place).title(title));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place,14));


    }
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;

        if(mMap!= null){
            //지도 확대 축소 버튼 생성
            mMap.getUiSettings().setZoomControlsEnabled(true);

        }

        /*LatLng cafe= new LatLng(37.55022317323927, 126.93529864186772);
        mMap.addMarker(new MarkerOptions().position(cafe).title("댕과댕빵"));


        cafe = new LatLng(37.50473994930677, 126.8768549111792);
        mMap.addMarker(new MarkerOptions().position(cafe).title("귀여운주인"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(cafe));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafe,14));*/
    }
}