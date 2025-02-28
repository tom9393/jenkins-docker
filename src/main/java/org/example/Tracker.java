package org.example;

import java.util.ArrayList;

public class Tracker {

    ArrayList<Session> sessions;

    public Tracker() {
        sessions = new ArrayList<>();
    }

    public void addSession(String date, double duration) {
        sessions.add(new Session(date, duration));
    }

    public void viewTotalPracticeTime(){
        System.out.println("Total Practice Time: " + getTotalPracticeTime());
    }

    public double getTotalPracticeTime() {
        double total = 0;
        for (Session session : sessions) {
            total += session.getDuration();
        }
        return total;
    }
    public boolean checkGraduationEligibility() {
        double time = getTotalPracticeTime();
        double nextKyu = 500;
        return time >= nextKyu;
    }
}
