package com.java.screenMatch.models;


import com.java.screenMatch.calc.classification;

public class Movies extends Title implements classification {

    private String director;
    //***\\
    // Constructor get and sette

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setincludedInThePlan(boolean b) {
    }


    @Override
    public int getClassification() {
        return (int) getTotalRating() / 2;
    }
}
