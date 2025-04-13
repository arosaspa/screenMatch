package com.java.screenMatch.models;


public class Series  extends Title{

    int seasonsForSeries;
    int seasons;
    int minutesForEpisode;

    //*********************************************************************\\

    @Override
    public int getDurationInMinutes() {
        return super.getDurationInMinutes();
    }

    public int getSeasonsForMovies() {
        return seasons * minutesForEpisode * seasonsForSeries;
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
