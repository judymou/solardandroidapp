package com.caltech.edu.dalehouseapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
 
public class ImageAdapter extends BaseAdapter {
    private Context mContext;
 
    // Keep all Images in array
    // 1 - TV
    // 2 - Speaker
    // 3 - blu-ray
    // 4 - projector
    // 5 - lights
    // 6 - blinds
    // 7 - HVAC (temperature and humidity)
    // 8 - Setting
    public Integer[] mThumbIds = {
            R.drawable.pic_1, R.drawable.pic_2,
            R.drawable.pic_3, R.drawable.pic_4,
            R.drawable.pic_5, R.drawable.pic_6,
            R.drawable.pic_7, R.drawable.pic_8
    };
 
    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }
 
    public int getCount() {
        return mThumbIds.length;
    }
 
    public Object getItem(int position) {
        return mThumbIds[position];
    }
 
    public long getItemId(int position) {
        return 0;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(mThumbIds[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(220, 220));
        return imageView;
    }
 
}