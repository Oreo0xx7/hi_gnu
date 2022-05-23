package com.example.hignu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Loading extends AppCompatActivity {

    private Button btn_move_on; // for intent
    private Button btn_move_off;
    ImageView img_logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        //intent
        btn_move_on = findViewById(R.id.btn_move_on);
        btn_move_on.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_on = new Intent(Loading.this, OnMain.class);
                startActivity(intent_on);
        // intent_end

            }
        });

        btn_move_off = findViewById(R.id.btn_move_off);
        btn_move_off.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_off = new Intent(Loading.this, OffMain.class);
                startActivity(intent_off);
            }
        });

        img_logo = (ImageView) findViewById(R.id.img_logo);
        img_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "HIGNU by Team.smarter", Toast.LENGTH_SHORT).show();
            }
        });
        //브런치 생성
    }
}