package com.example.monthlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> monthList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.list);

        monthList = new ArrayList<String>();

        monthList.add("Январь");
        monthList.add("Февраль");
        monthList.add("Март");
        monthList.add("Апрель");
        monthList.add("Май");
        monthList.add("Июнь");
        monthList.add("Июль");
        monthList.add("Август");
        monthList.add("Сентябрь");
        monthList.add("Октябрь");
        monthList.add("Ноябрь");
        monthList.add("Декабрь");

        ArrayAdapter<String> monthAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, monthList);
        listView.setAdapter(monthAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //String month = (String)listView.getAdapter().getItem(position);
                Toast.makeText(getApplicationContext(), "you selected: " + listView.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
        });

    }
}