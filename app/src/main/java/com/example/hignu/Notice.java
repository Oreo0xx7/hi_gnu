package com.example.hignu;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Notice extends AppCompatActivity {
    private ListView noticeListView;
    private NoticeAdapter adapter;
    private List<NoticeClass> noticeClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);
        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeClassList = new ArrayList<NoticeClass>();
        noticeClassList.add(new NoticeClass("Early Adaption Programs", "Foreign Cooperation Division", "2022-05-26"));
        noticeClassList.add(new NoticeClass("Gender Violence Prevention Campaign", "Foreign Cooperation Division", "2022-05-20"));
        noticeClassList.add(new NoticeClass("Comprehensive survey", "Foreign Cooperation Division", "2022-05-18"));
        noticeClassList.add(new NoticeClass("Dano Fan making experience activity", "Foreign Cooperation Division", "2022-05-18"));
        noticeClassList.add(new NoticeClass("The Increase in international flights due to the easing of COVID-19 quarantine", "Foreign Cooperation Division", "2022-05-09"));
        adapter = new NoticeAdapter(getApplicationContext(), noticeClassList);
        noticeListView.setAdapter(adapter);

        final Button btn_not1 = (Button) findViewById(R.id.btn_not1);
        final Button btn_not2 = (Button) findViewById(R.id.btn_not2);
        final LinearLayout notice = (LinearLayout) findViewById(R.id.notice);

        btn_not1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                notice.setVisibility(View.VISIBLE);
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
                notice.setVisibility(View.GONE);
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