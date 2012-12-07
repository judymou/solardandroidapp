package com.caltech.edu.dalehouseapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ThermostatActivity extends Activity {

	Button updateTempButton;
	EditText editTemp;
	TextView displayTemp;
	
    public void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thermostat_layout);

        displayTemp = (TextView) findViewById(R.id.textView2);
        editTemp = (EditText) findViewById(R.id.editText2);
        updateTempButton = (Button) findViewById(R.id.button1);

        updateTempButton.setOnClickListener(
            new View.OnClickListener() {
                public void onClick(View view) {
                    displayTemp.setText(editTemp.getText().toString());
                }
        });  
    }
}
