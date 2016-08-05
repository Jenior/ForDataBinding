package com.demo.xiang.databinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BindFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bind_fragment);
        setTitle(getResources().getStringArray(R.array.action)[2]);
    }
}
