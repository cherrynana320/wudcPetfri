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
import android.widget.ImageButton;

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

        ImageButton btn1 =  findViewById(R.id.shoppingmall_btn);
        ImageButton btn2 =  findViewById(R.id.cafe_btn);
        ImageButton btn3 =  findViewById(R.id.restaurant_btn);
        ImageButton btn4 =  findViewById(R.id.btn_hospital);
        ImageButton btn5 =  findViewById(R.id.button6);

        //마트,백화점
        btn1.setOnClickListener(new OnClickListener() {
            @Override

            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.52517554772086, 126.92554976870474
                        ,"IFC 몰","서울 영등포구 국제금융로 10 IFC몰 B1");
                gogoMap(37.56646325511798, 126.91995248411027
                        ,"곰팡이마트","서울 마포구 동교로51길 129-4 1층");
                gogoMap(37.52612169078573, 126.92847499815257,"더현대서울","서울 영등포구 여의대로 108 더현대 서울");
                gogoMap(37.490778006547245, 127.0051543032401
                        ,"롯데마트","서울 중구 한강대로 405");

            }
        });

        //카페
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.54811999196846, 126.92238378465503,"펠리칸 카페","서울 마포구 독막로14길 27");
                gogoMap(37.540195548001826, 127.00294391534037,"올드패리","서울 용산구 한남대로27길 66");
                gogoMap( 37.547278226464684, 126.92354625534102
                        ,"인솔커피","서울 마포구 독막로18길 16 1층 인솔커피 상수점");
                gogoMap(37.554290421544785, 126.97662734107982,"모듈러","서울 용산구 소월로2길 13 1층");
                gogoMap(37.566350542735776, 126.91982338226451,"땡스오트","서울 종로구 북촌로 21-10");
                gogoMap(37.52572038303644, 127.03692141294415,"꽁티드툴레아","서울 강남구 도산대로49길 39");
                gogoMap(37.509553793374224, 127.1284000534277,"꼬앙드파리","서울 송파구 마천로7길 18 1층");
                gogoMap(37.55993840806187, 126.92527505582433,"코코샌드","서울 마포구 양화로23길 22-7 2층");
                gogoMap(37.60135469390771, 126.99512275565655,"네이버후드","서울 서대문구 신촌로 1 (창천동) 유시티상가 201호 버거락");
                gogoMap(37.54376022212184, 126.79653601164621
                        ,"헤이더그린","서울 강서구 대장로 58");
                gogoMap(37.54089323453634, 126.98757566168335,"더베이커스테이블","서울 용산구 녹사평대로 244-1");


            }
        });




        //식당
        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.53094698582751, 126.97164334048144
                        ,"범스피자","서울 용산구 한강대로40가길 18 1층");
                gogoMap(37.51860459204525, 127.03801342698775,"노스트레스버거","서울 용산구 신흥로 62 1층");
                gogoMap(37.54960973871412, 126.92158872698859
                        ,"38도씨식당","서울 마포구 와우산로17길 19-17 2층");
                gogoMap(37.560074317521, 126.97952505582423,"팔레드신","서울 중구 퇴계로 67 레스케이프 호텔 6층");
                gogoMap(37.52505681515774, 127.05549568387399
                        ,"뜨락","서울 강남구 영동대로142길 13-3");
                gogoMap(37.54086612906062, 126.99198272700663
                        ,"카키스터프","서울 용산구 회나무로13가길 46-8");
                gogoMap(37.52089813824792, 127.02201405585127,"자매의부엌","서울 강남구 압구정로10길 40");
                gogoMap(37.61346635612191, 127.07669085399058
                        ,"캠프X그릴","서울 중랑구 동일로 929");
                gogoMap(37.53490911215305, 126.99499661166138
                        ,"꾸잉","서울 용산구 이태원로 189 1층");
                gogoMap(37.53601320976915,  126.99975408282532,"호머","서울 용산구 이태원로42길 19 2층");


            }
        });

        //미용실
        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.52314937150244, 127.05075914048143
                        ,"룰루헤어메이크업스튜디오","서울 강남구 선릉로152길 33 테이블2025빌딩 B1,1층 룰루");
                gogoMap(37.525304966339036, 127.03719782698788
                        ,"HMBA","서울 강남구 도산대로49길 34");
                gogoMap(37.611663759271316, 127.07836102698995
                        ,"살롱드바비","서울 중랑구 공릉로 8-8 2층");
                gogoMap( 37.59006281260495, 127.01926999815392
                        ,"Layer712","서울 성북구 보문로30라길 5-2");
                gogoMap(37.54937222096806, 126.92224812698856
                        ,"봉봉헤어살롱","서울 마포구 와우산로 51-23");
                gogoMap(37.60427085298647, 126.92120698564996
                        ,"욜로헤어","서울 은평구 은평로9길 3 1층 욜로헤어");
                gogoMap(37.640763852136566, 127.02401401413024
                        ,"헤어스테이","서울 강북구 도봉로 327");
                gogoMap(37.49298190600773, 126.90464288280968
                        ,"Hairsalon그리다","서울 영등포구 디지털로 420 신동아2차 파밀리에아파트 상가1층");
                gogoMap( 37.58322471610754, 126.99993909760546
                        ,"트리플엑스 대학로점","서울 종로구 대명길 29");
                gogoMap(37.511522592815055, 127.08273076303422,"CHOPHAIR 홍대점","서울 마포구 어울마당로 51-1 2층");



            }
        });

        //호텔/숙소
        btn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                mMap.clear();
                gogoMap(37.507008854080844, 127.0315140693166
                        ,"호텔 카푸치노","서울 강남구 봉은사로 155 호텔 카푸치노");
                gogoMap(37.481512912846505, 126.91497562698702,"URBAN HOTEL&GOLF","서울 관악구 난곡로64길 5");
                gogoMap(37.55541569964434, 126.975757240482
                        ,"밀레니엄 힐튼 서울","서울 중구 소월로 50");
                gogoMap(37.511176784238735, 127.05808154048097,"오크우드 프리미어 코엑스 센터","서울 강남구 테헤란로87길 46 오크우드 프리미어 코엑스 센터");
                gogoMap(37.53235148182199, 126.96070789815255
                        ,"그랜드 머큐어 앰배서더 호텔 앤 레지던스 서울 용산","서울 용산구 청파로20길 95");
                gogoMap(37.554608034991986, 127.11120959815308
                        ,"비스타 워커힐 서울 ","서울 광진구 워커힐로 177 비스타 워커힐 서울");
                gogoMap(37.521001776482194, 127.02853096456967,"포 포인츠 바이 쉐라톤 서울 강남","서울 강남구 도산대로 203");
                gogoMap(37.52381600616362, 127.05596472698804
                        ,"알로프트 서울 강남","서울 강남구 영동대로 736");
                gogoMap(37.56269945823044, 126.96968885342939
                        ,"프레이저 플레이스 센트럴","서울 중구 통일로 78 프레이저플레이스센트럴서울");
                gogoMap(37.55455590180348,  126.92130259815313,"라이즈, 오토그래프 컬렉션","서울 마포구 양화로 130");
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