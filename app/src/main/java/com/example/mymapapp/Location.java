package com.example.mymapapp;

public class Location {

    Location red = new Location();
    Location win = new Location();
    Location grand = new Location();

    public Location getRed(Double lat, Double lon) {
        lat = 47.8763;
        lon = 95.0169;
        red = (lat, lon);
        return red;
    }

    public Location getWin(Double lat, Double lon) {
        lat = 47.4110;
        lon = 94.2155;
        win = (lat, lon);
        return win;
    }

    public Location getGrand(Double lat, Double lon) {
        lat = 46.8666;
        lon = 92.4680;
        grand = (lat, lon);
        return grand;
    }
}
