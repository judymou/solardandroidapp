package com.caltech.edu.dalehouseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.AdapterView.OnItemClickListener;

public class ItemActivity extends Activity {

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
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        b1 = (Button) findViewById(R.id.button1);
//        b1.setOnClickListener(new OnClickListener() {
//
//			@Override
//			public void onClick(View arg0) {
//				if (b1_b == false) {
//					Toast.makeText(getApplicationContext(), "TV is on", Toast.LENGTH_SHORT).show();
//					b1_b = true;
//				} else {
//					Toast.makeText(getApplicationContext(), "TV is off", Toast.LENGTH_SHORT).show();
//					b1_b = false;
//				}
//			}
//        	
//        });
//        b2 = (Button) findViewById(R.id.button2);
//        b3 = (Button) findViewById(R.id.button3);
//        b4 = (Button) findViewById(R.id.button4);
//        b5 = (Button) findViewById(R.id.button5);
//        b6 = (Button) findViewById(R.id.button6);
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        
        GridView gridView = (GridView) findViewById(R.id.grid_view);
 
        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
        
        gridView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                    int position, long id) {
                Intent i;
                switch (position) {
                
                case 0:
                    i = new Intent(getApplicationContext(), TVActivity.class);
                    startActivity(i);
                    break;
                case 1:
                    i = new Intent(getApplicationContext(), SpeakerActivity.class);
                    startActivity(i);
                    break;
                case 2:
                    i = new Intent(getApplicationContext(), BluRayActivity.class);
                    startActivity(i);
                    break;
                case 3:
                    i = new Intent(getApplicationContext(), ProjectorActivity.class);
                    startActivity(i);
                    break;
                case 4:
                    i = new Intent(getApplicationContext(), LightsActivity.class);
                    startActivity(i);
                    break;
                case 5:
                	i = new Intent(getApplicationContext(), BlindsActivity.class);
                    startActivity(i);
                    break;
                case 6:
                	i = new Intent(getApplicationContext(), ThermostatActivity.class);
                    startActivity(i);
                    break;    
                }
            }


        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
