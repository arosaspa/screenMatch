package com.java.screenMatch.calc;
import com.java.screenMatch.models.Movies;

public class calcOfTime {

    private int totalTime;

    public void insert(Movies Movies) {
        totalTime += Movies.getDurationInMinutes();
    }
}
