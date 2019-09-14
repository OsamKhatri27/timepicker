package com.example.innu.timepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {
    TimePicker tp;
    TextView tv;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tp = (TimePicker) findViewById(R.id.timePicker);
        tv = (TextView) findViewById(R.id.textView);
        tp.setIs24HourView(true);//24 -> railway time,12 -> normal time.....
        b = (Button) findViewById(R.id.button);
        tv.setText(getCurrentTime());
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv.setText(getCurrentTime());

            }
        });
    }

    public String getCurrentTime() {
        String currenttime = "current time is: "+tp.getCurrentHour()+":"+tp.getCurrentMinute();
        return currenttime;
    }
}

