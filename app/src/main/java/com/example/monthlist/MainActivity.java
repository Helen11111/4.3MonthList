package com.example.monthlist;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //List<Month> monthList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyMonthAdapter adapter = new MyMonthAdapter(this, makeMonth());
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }

    MyMonth[] makeMonth() {
        MyMonth[] arr = new MyMonth[12];

        String[] monthArr = {"Январь","Февраль","Март","Апрель","Май","Июнь",
                "Июль","Август","Сентябрь","Октябрь","Ноябрь","Декабрь"};
        double[] tempArr = {-20, -25, -5, 0, 10, 20, 25, 25, 15, 9, 0, -10};
        int[] dayArr = {31,28,31,30,31,30,31,31,30,31,30,31};

        for (int i = 0; i < arr.length; i++) {
            MyMonth myMonth = new MyMonth();
            myMonth.month = monthArr[i];
            myMonth.temp = tempArr[i];
            myMonth.days = dayArr[i];
            arr[i] = myMonth;
        }
        return arr;
    }

    //monthList = new ArrayList<Month>();

        /*monthList.add("Январь", -20, 31, false);
        monthList.add("Февраль", -25, 28, false);
        monthList.add("Март", );
        monthList.add("Апрель");
        monthList.add("Май");
        monthList.add("Июнь");
        monthList.add("Июль");
        monthList.add("Август");
        monthList.add("Сентябрь");
        monthList.add("Октябрь");
        monthList.add("Ноябрь");
        monthList.add("Декабрь");*/

}