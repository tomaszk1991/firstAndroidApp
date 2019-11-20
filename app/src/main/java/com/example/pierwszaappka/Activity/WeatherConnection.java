package com.example.pierwszaappka.Activity;


import com.example.pierwszaappka.Components.Weather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class WeatherConnection {


    private static String stationURL = "https://danepubliczne.imgw.pl/api/data/synop/station/katowice";
    private BufferedReader reader;
    private String line;
    private StringBuffer responseContent = new StringBuffer();
    private HttpURLConnection connection;
    private URL url;



    public StringBuffer weatherString(){

        try {
            url = new URL(stationURL);
            connection =(HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            int status = connection.getResponseCode();

            if (status> 299)
            {
                reader = new BufferedReader((new InputStreamReader(connection.getErrorStream())));
                while ((line=reader.readLine())!=null){
                    responseContent.append(line);
                }
            } else {
                reader = new BufferedReader((new InputStreamReader(connection.getInputStream())));
                while ((line=reader.readLine())!=null){
                    responseContent.append(line);
                }
                reader.close();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return responseContent;
    }


    public Weather getWeather()  {






        return new Weather("Katowice", "11-11-2019", "13", "6", "5","1", "1", "1","1000");


    }




}