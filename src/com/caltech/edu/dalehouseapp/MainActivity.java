package com.caltech.edu.dalehouseapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button b1;
	private Button b2;
	private Button b3;
	private Button b4;
	private Button b5;
	private Button b6;
	private Boolean b1_b = false;
	private Boolean b2_b = false;
	private Boolean b3_b = false;
	private Boolean b4_b = false;
	private Boolean b5_b = false;
	private Boolean b6_b = false;
	
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				if (b1_b == false) {
					Toast.makeText(getApplicationContext(), "TV is on", Toast.LENGTH_SHORT).show();
					b1_b = true;
				} else {
					Toast.makeText(getApplicationContext(), "TV is off", Toast.LENGTH_SHORT).show();
					b1_b = false;
				}
			}
        	
        });
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);
        b4 = (Button) findViewById(R.id.button4);
        b5 = (Button) findViewById(R.id.button5);
        b6 = (Button) findViewById(R.id.button6);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    
}
