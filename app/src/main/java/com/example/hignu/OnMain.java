package com.example.hignu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class OnMain extends AppCompatActivity {

    private Button btn_location;
    private Button btn_tip;
    private Button btn_notice;
    private Button btn_support;

    private Button btn_location_1;
    private Button btn_location_2;
    private Button btn_location_3;
    private Button btn_tip_1;
    private Button btn_tip_2;
    private Button btn_tip_3;
    private Button btn_notice_1;
    private Button btn_notice_2;
    private Button btn_support_1;

    private DrawerLayout drawerLayout;
    private View drawerView;

    ImageButton btn_menu;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_main);

        drawerLayout = (DrawerLayout)findViewById(R.id.drawer_layout);
        drawerView = (View)findViewById(R.id.drawer);

        btn_menu = (ImageButton)findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                drawerLayout.openDrawer(drawerView);
            }
        });

        // drawerLayout.setDrawerListener(listener);
        drawerView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }
        });

        Button btn_menu_close = (Button)findViewById(R.id.btn_menu_close);
        btn_menu_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.closeDrawers();
            }
        });

        // Moving Page for each categories

        btn_location = findViewById(R.id.btn_location);
        btn_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(OnMain.this, InsideOfGNU1.class);
                startActivity(intent_off);
            }
        });

        btn_location_1 = findViewById(R.id.btn_location_1);
        btn_location_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(OnMain.this, InsideOfGNU1.class);
                startActivity(intent_off);
            }
        });

        btn_tip = findViewById(R.id.btn_tip);
        btn_tip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(OnMain.this, Application1.class);
                startActivity(intent_off);
            }
        });

        btn_tip_1 = findViewById(R.id.btn_tip_1);
        btn_tip_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(OnMain.this, Application1.class);
                startActivity(intent_off);
            }
        });

        btn_notice = findViewById(R.id.btn_notice);
        btn_notice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(OnMain.this, Notice1.class);
                startActivity(intent_off);
            }
        });

        btn_notice_1 = findViewById(R.id.btn_notice_1);
        btn_notice_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(OnMain.this, Notice1.class);
                startActivity(intent_off);
            }
        });



    }

    DrawerLayout.DrawerListener listener = new DrawerLayout.DrawerListener() {
        @Override
        public void onDrawerSlide(@NonNull View view, float v) {

        }

        @Override
        public void onDrawerOpened(@NonNull View view) {

        }

        @Override
        public void onDrawerClosed(@NonNull View view) {

        }

        @Override
        public void onDrawerStateChanged(int i) {

        }
    };
}