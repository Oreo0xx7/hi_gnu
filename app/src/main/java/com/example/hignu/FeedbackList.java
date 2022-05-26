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

public class FeedbackList extends AppCompatActivity {
    //using Notice form to test
    private ListView noticeListView;
    private NoticeAdapter adapter;
    private List<NoticeClass> noticeClassList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_list);

        noticeListView = (ListView) findViewById(R.id.noticeListView);
        noticeClassList = new ArrayList<NoticeClass>();
        noticeClassList.add(new NoticeClass("Early Adaption Programs", "Foreign Cooperation Division", "2022-05-26"));
        noticeClassList.add(new NoticeClass("Gender Violence Prevention Campaign", "Foreign Cooperation Division", "2022-05-20"));
        noticeClassList.add(new NoticeClass("Comprehensive survey", "Foreign Cooperation Division", "2022-05-18"));
        noticeClassList.add(new NoticeClass("Dano Fan making experience activity", "Foreign Cooperation Division", "2022-05-18"));
        noticeClassList.add(new NoticeClass("The Increase in international flights due to the easing of COVID-19 quarantine", "Foreign Cooperation Division", "2022-05-09"));
        adapter = new NoticeAdapter(getApplicationContext(), noticeClassList);
        noticeListView.setAdapter(adapter);


        final Button btn_fd_write = (Button) findViewById(R.id.btn_fd_write);
        final LinearLayout feedback = (LinearLayout) findViewById(R.id.feedback);


        btn_fd_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedback.setVisibility(View.GONE);
                btn_fd_write.setBackgroundColor(getResources().getColor(R.color.back_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new FeedbackFragmentWriting());
                fragmentTransaction.commit();
            }
        });

    }
}