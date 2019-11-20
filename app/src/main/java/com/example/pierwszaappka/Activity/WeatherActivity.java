package com.example.pierwszaappka.Activity;

import android.os.Bundle;

import com.example.pierwszaappka.Components.Weather;
import com.example.pierwszaappka.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.TextView;



public class WeatherActivity extends AppCompatActivity {

    private TextView weatherView, temperatureView, dataView, timeView;
    private TextView test;
    private static String station = "katowice";
    private static String celsius = " `\u2103";
    Weather weatherKato = null;
    String pobrane;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);

        weatherView = findViewById(R.id.weatherView);
        temperatureView = findViewById(R.id.temperatureView);
        dataView = findViewById(R.id.dataView);
        timeView = findViewById(R.id.timeView);
        test = findViewById(R.id.testPogody);

        Toolbar toolbar = findViewById(R.id.toolbar);
        WeatherConnection weatherConnection = new WeatherConnection();


            weatherKato = weatherConnection.getWeather();
        if (weatherKato != null) {
            weatherView.setText(weatherKato.getStacja());
            temperatureView.setText(weatherKato.getTemperatura());
            dataView.setText(weatherKato.getData_pomiaru());
            timeView.setText(weatherKato.getGodzina_pomiaru());
        }
        //pobrane=weatherConnection.weatherString().toString();
//        if (!pobrane.isEmpty()){
//            test.setText(weatherConnection.weatherString());
//        }


        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "ten guzik nic nie robi", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
