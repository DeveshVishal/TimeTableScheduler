package com.example.timetablescheduler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    TextView TxTime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TxTime = findViewById(R.id.editTextTime);
        Date currentTime = Calendar.getInstance().getTime();

        TxTime.setText(currentTime.toString());


    }
}
