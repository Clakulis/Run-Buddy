package com.example.group2_bigproject;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.TimePicker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CreateRoutePageActivity extends AppCompatActivity {

    TextView time_start = findViewById(R.id.time_start);
    TextView time_stop = findViewById((R.id.time_stop));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_route_page);

        View dialog_start_open_button = findViewById(R.id.time_start_dialog);
        View dialog_stop_open_button = findViewById(R.id.time_stop_dialog);

        dialog_start_open_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               open_start_dialog();
            }
        });

        dialog_stop_open_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_stop_dialog();
            }
        });
    }

    void open_start_dialog() {
        TimePickerDialog start_time = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String dayTime = "AM";
                if (hourOfDay>12) dayTime = "PM";
                time_start.setText(hourOfDay + ":" + minute+ " " + dayTime);
            }
        }, 0, 0, true);
    }

    void open_stop_dialog() {
        TimePickerDialog start_time = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                String dayTime = "AM";
                if (hourOfDay>12) dayTime = "PM";
                time_stop.setText(hourOfDay + ":" + minute+ " " + dayTime);
            }
        }, 0, 0, true);
    }
}