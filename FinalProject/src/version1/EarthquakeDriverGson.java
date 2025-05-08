package version1;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

public class EarthquakeDriverGson {
    public static void main(String[] args) {
        ArrayList<Event> events = new ArrayList<>();

        try {
            // Set up the URL
            URI uri = URI.create("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_month.geojson");
            URL url = uri.toURL();

            // Use Gson to read and parse the JSON
            Gson gson = new Gson();
            JsonObject json = gson.fromJson(new InputStreamReader(url.openStream()), JsonObject.class);


            
            
            
            
            
            
                Event event = new Event(mag, place, time, updated, eventUrl, title, geoType, latitude, longitude, depth);
                events.add(event);
        

        } catch (IOException e) {
            System.out.println("Error reading URL or JSON");
            e.printStackTrace();
        }

        System.out.println("Number of events: " + events.size());
    }


}

