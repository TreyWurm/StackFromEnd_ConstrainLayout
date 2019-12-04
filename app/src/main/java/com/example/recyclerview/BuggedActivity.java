package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import eu.davidea.flexibleadapter.FlexibleAdapter;

public class BuggedActivity extends AppCompatActivity {

    private FlexibleAdapter<ItemTest> adapter;
    private LinearLayoutManager layoutManager;
    private RecyclerView rvItems;

    public static void startActivity(Context caller) {
        Intent starter = new Intent(caller, BuggedActivity.class);
        caller.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bug);
        rvItems = findViewById(R.id.rv_items);

        List<ItemTest> flexItems = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            flexItems.add(new ItemTest("Title-" + i));
        }

        adapter = new FlexibleAdapter<>(flexItems);
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setStackFromEnd(true);


        rvItems.setHasFixedSize(true);
        rvItems.setLayoutManager(layoutManager);
        rvItems.setAdapter(adapter);
    }
}
