package com.exercise.person.myapplication.qq列表;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import java.util.List;

/**
 * Created by Administrator on 2016/9/7 0007.
 */
public class QQAdapter extends BaseAdapter{

    private final List<String> data;
    private final int resLayoutId;
    private final LayoutInflater mInflater;


    public QQAdapter(List<String> data, int resLayoutId, Context context){

        this.data = data;
        this.resLayoutId = resLayoutId;
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return data.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return createViewFromResource(mInflater,i,view,viewGroup,resLayoutId);
    }

    private View createViewFromResource(LayoutInflater mInflater, int i, View view, ViewGroup viewGroup, int resLayoutId) {
        View v;
        if (view == null) {
            v = mInflater.inflate(resLayoutId,viewGroup,false);

        }else{
            v= view;
        }

        return  v;

    }
}
