package com.example.hignu;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Tip extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip);

        final Button btn_tip1 = (Button) findViewById(R.id.btn_tip1);
        final Button btn_tip2 = (Button) findViewById(R.id.btn_tip2);
        final Button btn_tip3 = (Button) findViewById(R.id.btn_tip3);
        final LinearLayout tip = (LinearLayout) findViewById(R.id.tip);

        btn_tip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tip.setVisibility(View.GONE);
                btn_tip1.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_tip2.setBackgroundColor(getResources().getColor(R.color.fab_color));
                btn_tip3.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_tip, new AppFragmentTip());
                fragmentTransaction.commit();
            }
        });

        btn_tip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tip.setVisibility(View.GONE);
                btn_tip2.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_tip1.setBackgroundColor(getResources().getColor(R.color.fab_color));
                btn_tip3.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_tip, new KorFragmentTip());
                fragmentTransaction.commit();
            }
        });

        btn_tip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tip.setVisibility(View.GONE);
                btn_tip3.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_tip1.setBackgroundColor(getResources().getColor(R.color.fab_color));
                btn_tip2.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_tip, new BeginFragmentTip());
                fragmentTransaction.commit();
            }
        });


    }
}