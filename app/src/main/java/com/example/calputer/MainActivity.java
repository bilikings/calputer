package com.example.calputer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mb1 = null;
    private Button mb2 = null;
    private Button mb3 = null;
    private Button mb4 = null;
    private Button mb5 = null;
    private Button mb6 = null;
    private Button mb7 = null;
    private Button mb8 = null;
    private Button mb9 = null;
    private Button mb0 = null;
    private Button madd = null;
    private Button mreduce = null;
    private Button mmultiply = null;
    private Button mbit = null;
    private Button mdivision = null;
    private Button mback = null;
    private Button mequal = null;

    private TextView minputBox;
    private StringBuilder pending = new StringBuilder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
