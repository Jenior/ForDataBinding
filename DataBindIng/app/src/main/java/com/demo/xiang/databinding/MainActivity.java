package com.demo.xiang.databinding;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements MainAdapter.itemClickListener {
    private RecyclerView recyclerView;
    private MainAdapter  mainAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
        initData();
    }

    public void initRecyclerView() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);
        mainAdapter = new MainAdapter();
        recyclerView.setAdapter(mainAdapter);
        mainAdapter.setOnItemClickListener(this);
    }

    public void initData() {
        String[] list = this.getResources().getStringArray(R.array.action);
        mainAdapter.refresh(Arrays.asList(list));
    }

    @Override
    public void onClick(int position) {
        switch (position) {
            case 0:
                startActivity(new Intent(this, TestJavaBeanActivity.class));
                break;
        }
    }
}
