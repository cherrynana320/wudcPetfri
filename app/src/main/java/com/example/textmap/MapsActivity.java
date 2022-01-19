package com.example.textmap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
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

        //마트,백화점
        btn1.setOnClickListener(new OnClickListener() {
            @Override

            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.52517554772086, 126.92554976870474
                        ,"IFC 몰","여긴 이화여대입니다. 어디에 위치해있고 아ㅏ아아");
                gogoMap(37.56646325511798, 126.91995248411027
                        ,"곰팡이마트","여긴 이화여대");
                gogoMap(37.52612169078573, 126.92847499815257,"더현대서울","여긴 이화여대");
                gogoMap(37.490778006547245, 127.0051543032401
                        ,"롯데마트","여긴 이화여대");

            }
        });

        //카페
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.54811999196846, 126.92238378465503,"펠리칸 카페","여긴 이화여대");
                gogoMap(37.540195548001826, 127.00294391534037,"올드패리","여긴 이화여대");
                gogoMap( 37.547278226464684, 126.92354625534102
                        ,"인솔커피","여긴 이화여대");
                gogoMap(37.554290421544785, 126.97662734107982,"모듈러","여긴 이화여대");
                gogoMap(37.566350542735776, 126.91982338226451,"땡스오트","여긴 이화여대");
                gogoMap(37.52572038303644, 127.03692141294415,"꽁티드툴레아","여긴 이화여대");
                gogoMap(37.509553793374224, 127.1284000534277,"꼬앙드파리","여긴 이화여대");
                gogoMap(37.55993840806187, 126.92527505582433,"코코샌드","여긴 이화여대");
                gogoMap(37.60135469390771, 126.99512275565655,"네이버후드","여긴 이화여대");
                gogoMap(37.54376022212184, 126.79653601164621
                        ,"헤이더그린","여긴 이화여대");
                gogoMap(37.54089323453634, 126.98757566168335,"더베이커스테이블","여긴 이화여대");


            }
        });


        //식당
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.53094698582751, 126.97164334048144
                        ,"범스피자","여긴 이화여대");
                gogoMap(37.51860459204525, 127.03801342698775,"노스트레스버거","여긴 이화여대");
                gogoMap(37.54960973871412, 126.92158872698859
                        ,"38도씨식당","여긴 이화여대");
                gogoMap(37.560074317521, 126.97952505582423,"팔레드신","여긴 이화여대");
                gogoMap(37.52505681515774, 127.05549568387399
                        ,"뜨락","여긴 이화여대");
                gogoMap(37.54086612906062, 126.99198272700663
                        ,"카키스터프","여긴 이화여대");
                gogoMap(37.52089813824792, 127.02201405585127,"자매의부엌","여긴 이화여대");
                gogoMap(37.61346635612191, 127.07669085399058
                        ,"캠프X그릴","여긴 이화여대");
                gogoMap(37.53490911215305, 126.99499661166138
                        ,"꾸잉","여긴 이화여대");
                gogoMap(37.53601320976915,  126.99975408282532,"호머","여긴 이화여대");


            }
        });
    }

    public void gogoMap(double latitude, double longitude,String title,String info) {

        LatLng place= new LatLng(latitude, longitude);

        mMap.addMarker(new MarkerOptions().position(place).title(title).snippet(info));
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