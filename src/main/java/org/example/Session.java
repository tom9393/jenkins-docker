package org.example;

public class Session {

    private String date;
    private double duration;

    public Session(String date, double duration) {
        this.date = date;
        this.duration = duration;
    }

    public String getDate() {
        return date;
    }

    public double getDuration() {
        return duration;
    }
}
