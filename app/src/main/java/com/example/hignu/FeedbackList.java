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
    private ListView feedback_list_view;
    private FeedAdapter adapter;
    private List<FeedViewClass> feedList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_list);

        feedback_list_view = (ListView) findViewById(R.id.feedback_list_view);
        feedList = new ArrayList<FeedViewClass>();
        feedList.add(new FeedViewClass("Demand for Adding Information", "User007", "2022-05-20"));
        feedList.add(new FeedViewClass("Demand for Upgrading", "User005", "2022-05-09"));
        feedList.add(new FeedViewClass("Demand for Upgrading OfflinePage", "User002", "2022-05-03"));
        feedList.add(new FeedViewClass("Demand for Adding Information", "User001", "2022-05-01"));
        adapter = new FeedAdapter(getApplicationContext(), feedList);
        feedback_list_view.setAdapter(adapter);


        final Button btn_fd_write = (Button) findViewById(R.id.btn_fd_write);
        final LinearLayout feedback = (LinearLayout) findViewById(R.id.feedback);


        btn_fd_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedback.setVisibility(View.GONE);
                btn_fd_write.setVisibility(View.GONE);
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new FeedbackFragmentWriting());
                fragmentTransaction.commit();
            }
        });

    }
}