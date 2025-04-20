package com.java.screenMatch.models;

import com.java.screenMatch.calc.classification;

public abstract class Episode implements classification {

    // Attributes
    private int number;
    private String title;
    private Series serie;
    private int totalVizualizations = 0;


    // Constructor
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    // Methods
    @Override
    public int getClassification() {
        if (totalVizualizations > 100) {
            return 4;
        } else {
            return 2;
        }


    }
}
