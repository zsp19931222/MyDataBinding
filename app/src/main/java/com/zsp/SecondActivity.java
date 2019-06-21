package com.zsp;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.zsp.databinding.ActivitySecondBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * description:
 * author:created by Andy on 2019/6/20 0020 10:43
 * email:zsp872126510@gmail.com
 */
public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySecondBinding secondBinding = DataBindingUtil.setContentView(this, R.layout.activity_second);
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add("" + i);
        }
        secondBinding.setList(list);

        Map<String, Object> objectMap = new HashMap<>();
        objectMap.put("key", "map");
        secondBinding.setMap(objectMap);

        String[] strings = {"string[]01", "string[]02"};
        secondBinding.setArray(strings);

        secondBinding.setAge(25);
        secondBinding.setStr("张三");
    }
}
