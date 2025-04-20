package com.java.screenMatch.models;

public class Title {

    public String title;
    public int releaseDate = 0;
    public int durationInMinutes = 0;
    private boolean includedInThePlan = false;
    public double totalRating = 0.0;
    public String PrintMovieDetails;
    public double rating = 0.0;

    //*********************************************************************\\

    public double getTotalRating() {
        return rating ;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getPrintMovieDetails() {
        return PrintMovieDetails;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public boolean isIncludedInThePlan() {
        return includedInThePlan;
    }


//*********************************************************************\\

    public void setPrintMovieDetails(String printMovieDetails) {
        this.PrintMovieDetails = printMovieDetails;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void setIncludedInThePlan(boolean includedInThePlan) {
        this.includedInThePlan = includedInThePlan;
    }

    public void setTotalRating(double totalRating) {
        this.totalRating = totalRating;
    }


    //*********************************************************************\\
    void printMovieDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Duration: " + getDurationInMinutes()+ " minutes");
        System.out.println("Included in the plan: " + (includedInThePlan ? "Yes" : "No"));
    }

    void Ratings (double rating) {
        totalRating += rating;
        System.out.println("Ratings: 8.5/10");
    }
}
