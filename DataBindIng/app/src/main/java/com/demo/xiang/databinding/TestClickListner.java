package com.demo.xiang.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.demo.xiang.databinding.databinding.ActivityTestClickListnerBinding;

public class TestClickListner extends AppCompatActivity {
private ActivityTestClickListnerBinding activityTestClickListnerBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTestClickListnerBinding = DataBindingUtil.setContentView(this,R.layout.activity_test_click_listner);
        activityTestClickListnerBinding.setClickListner(this);
        setTitle(getResources().getStringArray(R.array.action)[1]);
    }

  public void click(View v){
      Toast.makeText(TestClickListner.this,((Button)v).getText().toString()+"",Toast.LENGTH_SHORT).show();
  }
}
