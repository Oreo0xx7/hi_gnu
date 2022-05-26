package com.example.hignu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class FeedbackWriting extends AppCompatActivity {

    private EditText et_fd_title, et_fd_nick, et_fd_con;
    private Button btn_new_feed;
    private RadioButton fd_secret;
    int i = 33;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_writing);

        et_fd_title = findViewById(R.id.et_fd_title);
        et_fd_nick = findViewById(R.id.et_fd_nick);
        et_fd_con = findViewById(R.id.et_fd_con);
        fd_secret = findViewById(R.id.fd_secret);
        btn_new_feed = findViewById(R.id.btn_new_feed);
        btn_new_feed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String titleFD = et_fd_title.getText().toString();
                String nickFD = et_fd_nick.getText().toString();
                String contentFD = et_fd_con.getText().toString();
                Boolean secretFD = Boolean.valueOf(fd_secret.getText().toString());
                int numFD = ++i;

                Response.Listener<String> responseListenter = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success");
                            if(success){
                                Toast.makeText(getApplicationContext(), "Your feedback is saved well.", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(FeedbackWriting.this, FeedbackViewing.class);
                            }
                            else{
                                Toast.makeText(getApplicationContext(), "Fail to write new feedback.", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };

            //    NewFeed newFeed = new NewFeed(numFD, titleFD, nickFD, secretFD, contentFD, responseListenter);
            //    RequestQueue queue = Volley.newRequestQueue(FeedbackWriting.this);
            //    queue.add(newFeed);
            }
        });
    }
}