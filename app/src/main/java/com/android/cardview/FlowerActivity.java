package com.android.cardview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.TextView;

public class FlowerActivity extends AppCompatActivity {

    TextView dflowergridtext;
    GridLayout dflowergridlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flower);

        dflowergridtext =  findViewById(R.id.textGridflower);
        dflowergridlayout = findViewById(R.id.grid_layout_flower);

    }
}
