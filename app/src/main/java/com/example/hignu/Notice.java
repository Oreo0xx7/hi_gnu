package com.example.hignu;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Notice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        final Button btn_not1 = (Button) findViewById(R.id.btn_not1);
        final Button btn_not2 = (Button) findViewById(R.id.btn_not2);
        final LinearLayout location = (LinearLayout) findViewById(R.id.notice);

        btn_not1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location.setVisibility(View.GONE);
                btn_not1.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_not2.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_notice, new NoticeFragment());
                fragmentTransaction.commit();
            }
        });

        btn_not2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                location.setVisibility(View.GONE);
                btn_not2.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_not1.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_notice, new CalendarFragment());
                fragmentTransaction.commit();
            }
        });


    }
}