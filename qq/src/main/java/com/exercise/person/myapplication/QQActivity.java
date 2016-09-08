package com.exercise.person.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class QQActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qq);
        ListView listView = (ListView) findViewById(R.id.qq_list);
        List<String> data = new ArrayList<>();
        for (int i = 0;i<10;i++)
        {
            data.add("");
        }
        QQAdapter qqAdapter = new QQAdapter(
                data,
                R.layout.item_qq_adapter,
                this
        );
        listView.setAdapter(qqAdapter);
    }
}
