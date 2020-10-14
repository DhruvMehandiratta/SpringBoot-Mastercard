package com.example.mastercardinterviewrestservice;

public class Interview {
    public final String interviewee;
    public final String date;

    public Interview(String interviewee, String date) {
        this.interviewee = interviewee;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public String getInterviewee() {
        return interviewee;
    }
}
