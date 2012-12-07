package com.caltech.edu.dalehouseapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class ProjectorActivity extends Activity {
    
    private Button b1;
    private Boolean b1_b = false;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.projector_layout);
        
      b1 = (Button) findViewById(R.id.button1);
      b1.setBackgroundResource(R.drawable.projector_off);
      
      b1.setOnClickListener(new OnClickListener() {
        public void onClick(View arg0) {
            // TODO Auto-generated method stub
            if (b1_b == false) {
                b1.setBackgroundResource(R.drawable.projector_on);
                Toast.makeText(getApplicationContext(), "projector is on", Toast.LENGTH_SHORT).show();
                b1_b = true;
            } else {
                b1.setBackgroundResource(R.drawable.projector_off);
                Toast.makeText(getApplicationContext(), "projector is off", Toast.LENGTH_SHORT).show();
                b1_b = false;
            }
        }
      });
      

      
      
    }
}
