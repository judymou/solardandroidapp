package com.caltech.edu.dalehouseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class BluRayActivity extends Activity {
    
    private Button b1;
    private Button b2;
    private Boolean b1_b = false;
    private Boolean b2_b = false;
    
    @Override
    public void onCreate(Bundle  savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blu_ray_layout);
        
      b1 = (Button) findViewById(R.id.button1);
      b2 = (Button) findViewById(R.id.button2);
      b1.setBackgroundResource(R.drawable.blu_ray_off);
      b2.setBackgroundResource(R.drawable.blu_ray_off);
      
      b1.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            if (b1_b == false) {
                b1.setBackgroundResource(R.drawable.blu_ray_on);
                Toast.makeText(getApplicationContext(), "blu-ray1 is on", Toast.LENGTH_SHORT).show();
                b1_b = true;
            } else {
                b1.setBackgroundResource(R.drawable.blu_ray_off);
                Toast.makeText(getApplicationContext(), "blu-ray1 is off", Toast.LENGTH_SHORT).show();
                b1_b = false;
            }
        }
      });
      
      
      b2.setOnClickListener(new OnClickListener() {
          @Override
          public void onClick(View arg0) {
              // TODO Auto-generated method stub
              if (b2_b == false) {
                  b2.setBackgroundResource(R.drawable.blu_ray_on);
                  Toast.makeText(getApplicationContext(), "blu-ray2 is on", Toast.LENGTH_SHORT).show();
                  b2_b = true;
              } else {
                  b2.setBackgroundResource(R.drawable.blu_ray_off);
                  Toast.makeText(getApplicationContext(), "blu-ray2 is off", Toast.LENGTH_SHORT).show();
                  b2_b = false;
              }
          }
      });
      
      
    }
}
