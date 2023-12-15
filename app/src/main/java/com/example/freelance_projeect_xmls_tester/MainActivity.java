package com.example.freelance_projeect_xmls_tester;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Toast;

import com.harrywhewell.scrolldatepicker.DayScrollDatePicker;
import com.harrywhewell.scrolldatepicker.OnDateSelectedListener;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import in.akshit.horizontalcalendar.HorizontalCalendarView;
import in.akshit.horizontalcalendar.Tools;

public class MainActivity extends AppCompatActivity {

   // private HorizontalCalendarView horizontalCalendarView;

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.monitor_layout);

        DayScrollDatePicker mPicker = findViewById(R.id.day_date_picker);

        mPicker.getSelectedDate(new OnDateSelectedListener() {
            @Override
            public void onDateSelected(@Nullable Date date) {
                if(date != null){

                    Toast.makeText(MainActivity.this, "Date"+date, Toast.LENGTH_SHORT).show();
                    // do something with selected date
                }
            }
        });


//        HorizontalCalendarView calendarView = findViewById(R.id.calendar);
//
//
//        Calendar starttime = Calendar.getInstance();
//        starttime.add(Calendar.MONTH,-6);
//
//        Calendar endtime = Calendar.getInstance();
//        endtime.add(Calendar.MONTH,6);
//
//
//        ArrayList datesToBeColored = new ArrayList();
//        datesToBeColored.add(Tools.getFormattedDateToday());
//
//
//
//        calendarView.setUpCalendar(starttime.getTimeInMillis(),
//                endtime.getTimeInMillis(),
//                datesToBeColored,
//                new HorizontalCalendarView.OnCalendarListener() {
//                    @Override
//                    public void onDateSelected(String date) {
//                        Toast.makeText(MainActivity.this,date+" clicked!",Toast.LENGTH_SHORT).show();
//                    }
//                });

//        horizontalCalendarView = findViewById(R.id.horizontalcalendarview);
//
//
//        horizontalCalendarView.showControls(false);
//        horizontalCalendarView.setBackgroundColor(getResources().getColor(R.color.dateBlue));
//        horizontalCalendarView.changeAccent(R.color.white);

    }

}