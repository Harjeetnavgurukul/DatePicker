package com.draw.datepickerapp;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class MainActivity extends AppCompatActivity {

    DatePicker datePicker;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatePicker datePicker = (DatePicker)findViewById(R.id.date);
        int day = datePicker.getDayOfMonth();

        int month = datePicker.getMonth();

        int year = datePicker.getYear();
         int firstDay = datePicker.getFirstDayOfWeek();

    }
}
