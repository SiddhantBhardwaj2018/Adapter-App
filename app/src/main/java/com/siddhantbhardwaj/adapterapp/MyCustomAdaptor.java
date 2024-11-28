package com.siddhantbhardwaj.adapterapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyCustomAdaptor extends BaseAdapter {

    private Context context;
    private String[] items;

    public MyCustomAdaptor(Context context, String[] items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.length;
    }

    @Override
    public Object getItem(int position) {
        return items[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;

        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.my_list_item,parent,false);
            viewHolder = new ViewHolder();
            viewHolder.textView = convertView.findViewById(R.id.text1);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textView.setText(items[position]);

        return convertView;
    }

    static class ViewHolder{

        TextView textView;

    }

}
