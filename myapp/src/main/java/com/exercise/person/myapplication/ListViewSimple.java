package com.exercise.person.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/7 0007.
 */
public class ListViewSimple extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_qq);

        ListView listView = (ListView) findViewById(R.id.qq_list);

        List<Map<String, Object>> data = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("jpg",R.mipmap.ic_launcher);
            map.put("txt",i);
            data.add(map);
        }

        SimpleAdapter adapter = new SimpleAdapter(
                this,
                data,
                R.layout.item_test,
                new String[]{},
                new int[]{R.id.imageview,R.id.textview}

        );

        listView.setAdapter(adapter);
    }
}
