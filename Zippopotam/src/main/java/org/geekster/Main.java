package org.geekster;

import netscape.javascript.JSObject;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws Exception{

        URL getUrl = new URL("https://api.zippopotam.us/us/33162");
        HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
        connection.setRequestMethod("GET");

        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {

            BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuffer jsonResponseCode =new StringBuffer();
            String readline = null;

            while((readline = in.readLine()) != null){
                jsonResponseCode.append(readline);
            }
            in.close();

            JSONObject jsonObject = new JSONObject(jsonResponseCode.toString());
            System.out.println(jsonObject);
        }else {
            System.out.println("This is not a Valid URL : " + responseCode);
        }
    }
}