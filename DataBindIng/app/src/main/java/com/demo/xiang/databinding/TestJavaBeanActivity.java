package com.demo.xiang.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.demo.xiang.databinding.databinding.ActivityTestJavaBeanBinding;
import com.demo.xiang.databinding.model.UserBean;

public class TestJavaBeanActivity extends AppCompatActivity {
    private ActivityTestJavaBeanBinding activityTestJavaBeanBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityTestJavaBeanBinding = DataBindingUtil.setContentView(this, R.layout.activity_test_java_bean);
        String titles[] = getResources().getStringArray(R.array.action);
        setTitle(titles[0]);
        init();
    }

    private void init() {
        UserBean userBean = new UserBean("小米", "6", "mi");
        activityTestJavaBeanBinding.setUser(userBean);
    }
}
