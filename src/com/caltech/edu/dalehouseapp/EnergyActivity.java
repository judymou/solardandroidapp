package com.caltech.edu.dalehouseapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class EnergyActivity extends Activity {

    public void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy_layout);
        
        TextView textview = new TextView(this);
        textview.setText("This is Energy tab");
        setContentView(textview);
    }
}
