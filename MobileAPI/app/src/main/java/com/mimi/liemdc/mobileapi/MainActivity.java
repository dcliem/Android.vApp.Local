package com.mimi.liemdc.mobileapi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ca.mas.foundation.MAS;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MAS.start(this);
    }
}
