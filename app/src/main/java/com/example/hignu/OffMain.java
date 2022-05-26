package com.example.hignu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class OffMain extends AppCompatActivity {

    ImageView off_cate1, off_cate2, off_cate3, off_cate4, off_cate5, off_cate6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_main);

        off_cate1 = (ImageView)findViewById(R.id.off_cate1);
        off_cate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffMain.this, OffCategory1.class);
                startActivity(intent);
            }
        });

        off_cate2 = (ImageView)findViewById(R.id.off_cate2);
        off_cate2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffMain.this, OffCategory2.class);
                startActivity(intent);
            }
        });

        off_cate3 = (ImageView)findViewById(R.id.off_cate3);
        off_cate3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffMain.this, OffCategory3.class);
                startActivity(intent);
            }
        });

        off_cate4 = (ImageView)findViewById(R.id.off_cate4);
        off_cate4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffMain.this, OffCategory4.class);
                startActivity(intent);
            }
        });

        off_cate5 = (ImageView)findViewById(R.id.off_cate5);
        off_cate5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffMain.this, OffCategory5.class);
                startActivity(intent);
            }
        });

        off_cate6 = (ImageView)findViewById(R.id.off_cate6);
        off_cate6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(OffMain.this, OffCategory6.class);
                startActivity(intent);
            }
        });

    }
}