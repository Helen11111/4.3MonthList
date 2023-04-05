package com.example.monthlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyMonthAdapter extends ArrayAdapter<MyMonth> {
    public MyMonthAdapter(@NonNull Context context, MyMonth[] arr) {
        super(context, R.layout.adapter_item, arr);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        final MyMonth month = getItem(position);

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item, null);
        }

        ((TextView)convertView.findViewById(R.id.txtView)).setText(month.month);
        ((TextView)convertView.findViewById(R.id.txtView2)).setText(String.valueOf(month.temp));
        ((TextView)convertView.findViewById(R.id.txtView3)).setText(String.valueOf(month.days));

        if(month.temp > 10)
            ((ImageView) convertView.findViewById(R.id.imgView)).setImageResource(R.drawable.sun);
        else if (month.temp >= 0 && month.temp <= 10)
            ((ImageView) convertView.findViewById(R.id.imgView)).setImageResource(R.drawable.cloud);
        else
            ((ImageView) convertView.findViewById(R.id.imgView)).setImageResource(R.drawable.snow);

        CheckBox ch = (CheckBox) convertView.findViewById(R.id.checkBox);
        ch.setChecked(month.like);

        ch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                month.like = ((CheckBox) v).isChecked();
            }
        });


        return convertView;
    }
}
