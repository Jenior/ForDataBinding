package com.demo.xiang.databinding.fragment;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.demo.xiang.databinding.R;
import com.demo.xiang.databinding.databinding.FragmentTestBinding;
import com.demo.xiang.databinding.model.UserBean;

/**
 * Created by Administrator on 2016/8/5.
 */
public class TestFragment extends Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentTestBinding fragmentTestBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_test,container,false);
        fragmentTestBinding.setUser(new UserBean("华为","6","CN"));
        return fragmentTestBinding.getRoot();
    }
}
