package com.example.customadapter4;

public class quake {
    private String magnitude;
    private String location;
    private long timeInMilliseconds;

    public quake(String magnitude, String location, long timeInMilliseconds) {
        this.magnitude = magnitude;
        this.location = location;
        this.timeInMilliseconds = timeInMilliseconds;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public long getTimeInMilliseconds() {
        return timeInMilliseconds;
    }
}