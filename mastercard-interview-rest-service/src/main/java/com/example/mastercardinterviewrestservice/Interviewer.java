package com.example.mastercardinterviewrestservice;

public class Interviewer {
    public final String name;
    public final Interview[] interviews;

    public Interviewer(String name, Interview[] interviews) {
        this.name = name;
        this.interviews = interviews;
    }

    public Interview[] getInterviews() {
        return interviews;
    }

    public String getName() {
        return name;
    }

}
