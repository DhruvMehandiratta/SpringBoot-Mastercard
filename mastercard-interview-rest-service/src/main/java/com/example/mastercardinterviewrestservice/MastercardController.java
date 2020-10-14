package com.example.mastercardinterviewrestservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class MastercardController {

    private final AtomicLong counter = new AtomicLong();

    // specifies that this is going to be a get request with /greeting  entrypoint
    String content = "Welcome! This is the Mastercard Interview.";

    Interview dhruvInterview = new Interview("Dhruv", "October 18th");
    Interview davidInterview = new Interview("David", "October 19th");
    Interview charlieInterview = new Interview("Charlie", "October 19th");


    Interview[] ashishInterviews = {dhruvInterview, davidInterview};
    Interviewer ashish = new Interviewer("Ashish", ashishInterviews);

    Interview[] michaelInterviews = {charlieInterview};
    Interviewer michael = new Interviewer("Michael", michaelInterviews);

    Interviewer[] defaultInterviewers = {ashish, michael};
    // give in parameters default interviewers and all.
    @GetMapping("/mastercard")
    public Mastercard mastercard(@RequestParam(value = "technical", defaultValue = "true") boolean technical){
        return new Mastercard(counter.incrementAndGet(), technical, "content", defaultInterviewers);
    }
}