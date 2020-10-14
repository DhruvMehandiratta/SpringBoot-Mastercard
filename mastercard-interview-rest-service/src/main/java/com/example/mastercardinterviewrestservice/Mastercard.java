package com.example.mastercardinterviewrestservice;

public class Mastercard {
    private final long id;
    private final boolean isTechnical;
    private final String content;
    private final Interviewer[] interviewers;

    public Mastercard(long id, boolean isTechnical, String content, Interviewer[] interviewers) {
        this.id = id;
        this.isTechnical = isTechnical;
        this.content = content;
        this.interviewers = interviewers;
    }

    public String getContent() {
        return content;
    }

    public long getId() {
        return id;
    }

    public boolean isTechnical() {
        return isTechnical;
    }

    public Interviewer[] getInterviewers() {
        return interviewers;
    }
}
