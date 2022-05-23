package com.example.hignu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Category extends AppCompatActivity {

    private ListView category;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        category = (ListView) findViewById(R.id.category);
        List<String> data = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,data);
        category.setAdapter(adapter);

        data.add("Location");
        data.add("Tip");
        data.add("Notice");
        data.add("Support");
        adapter.notifyDataSetChanged(); //데이터 저장
    }
}