package com.example.hignu;

import static android.support.design.R.color.design_default_color_primary_dark;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class FeedbackList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_list);

        final Button btn_fd_list = (Button) findViewById(R.id.btn_fd_list);
        final Button btn_fd_write = (Button) findViewById(R.id.btn_fd_write);
        final LinearLayout feedback = (LinearLayout) findViewById(R.id.feedback);

        btn_fd_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedback.setVisibility(View.GONE);
                btn_fd_list.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_fd_write.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new FeedbackFragmentList());
                fragmentTransaction.commit();
            }
        });

        btn_fd_write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                feedback.setVisibility(View.GONE);
                btn_fd_write.setBackgroundColor(getResources().getColor(R.color.back_color));
                btn_fd_list.setBackgroundColor(getResources().getColor(R.color.fab_color));
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new FeedbackFragmentWriting());
                fragmentTransaction.commit();
            }
        });

    }
}