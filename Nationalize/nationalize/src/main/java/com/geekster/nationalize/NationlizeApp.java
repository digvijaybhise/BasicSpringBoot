package com.geekster.nationalize;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NationlizeApp {

    public static void main(String[] args) throws Exception {

        URL getUrl = new URL("https://api.nationalize.io/?name=nathaniel");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonResponseCode = new StringBuffer();
            String readline = null;

            while((readline = in.readLine()) != null){
                jsonResponseCode.append(readline);
            }
            in.close();
            JSONObject jsonObject = new JSONObject(jsonResponseCode.toString());
            System.out.println(jsonObject);
        }else {
            System.out.println("This is Invalid URL : " + responseCode);
        }
    }
}
