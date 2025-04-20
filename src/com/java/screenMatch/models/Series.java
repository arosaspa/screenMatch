package com.java.screenMatch.models;


public class Series  extends Title {

    int seasonsForSeries;
    int seasons;
    int minutesForEpisode;

    //*********************************************************************\\
    // Constructor get and setter


    @Override
    public int getDurationInMinutes() {
        return seasons * minutesForEpisode * seasonsForSeries;
    }


    public int getSeasonsForMovies() {
        return seasonsForSeries;
    }

    public void setSeasonsForMovies(int seasonsForMovies) {
        this.seasonsForSeries = seasonsForMovies;
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getMinutesForEpisode() {
        return minutesForEpisode;
    }

    public void setMinutesForEpisode(int minutesForEpisode) {
        this.minutesForEpisode = minutesForEpisode;
    }
}
