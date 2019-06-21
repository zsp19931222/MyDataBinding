package com.zsp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.zsp.bean.UserBean;
import com.zsp.databinding.ActivityMainBinding;

/**
 * @Description:databinging基本使用
 * @Author:Andy
 * @Date:2019/6/20 0020 10:40
 */
public class MainActivity extends AppCompatActivity {
    UserBean userBean;
    private int age = 25;
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        userBean = new UserBean("李四", age);
        binding.setUser(userBean);
    }

    public void add(View view) {
        age++;
        userBean.setAge(age);
        binding.setUser(userBean);
    }
}
