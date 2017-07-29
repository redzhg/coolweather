package com.coolweather.android;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import static android.util.Log.*;

public class MainActivity extends AppCompatActivity {

    static private  String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        if(prefs.getString("weather", null)!= null){
            Intent intent = new Intent(this, WeatherActivity.class);
            startActivity(intent);
            d(TAG, "weather info is not null");
            finish();
        }else{
            d(TAG, "weather info is null");
        }

    }
}
