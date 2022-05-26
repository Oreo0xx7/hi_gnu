package com.example.hignu;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Location extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        final Button btn_loc1 = (Button) findViewById(R.id.btn_loc1);
        final Button btn_loc2 = (Button) findViewById(R.id.btn_loc2);
        final Button btn_loc3 = (Button) findViewById(R.id.btn_loc3);
        final LinearLayout location = (LinearLayout) findViewById(R.id.location);

        btn_loc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location.setVisibility(View.GONE);
                btn_loc1.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_loc2.setBackgroundColor(getResources().getColor(R.color.fab_color));
                btn_loc3.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_location, new InsideFragmentLocation());
                fragmentTransaction.commit();
            }
        });

        btn_loc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location.setVisibility(View.GONE);
                btn_loc2.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_loc1.setBackgroundColor(getResources().getColor(R.color.fab_color));
                btn_loc3.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_location, new OutsideFragmentLocation());
                fragmentTransaction.commit();
            }
        });

        btn_loc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location.setVisibility(View.GONE);
                btn_loc3.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_loc1.setBackgroundColor(getResources().getColor(R.color.fab_color));
                btn_loc2.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_location, new TravelFragmentLocation());
                fragmentTransaction.commit();
            }
        });


    }
}