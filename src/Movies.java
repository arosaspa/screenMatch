public class Movies {

    String title;
    int releaseDate = 0;
    int durationInMinutes = 0;
    boolean includedInThePlan = false;

    double totalRating = 0.0;


    void printMovieDetails() {
        System.out.println("Movie Title: " + title);
        System.out.println("Release Date: " + releaseDate);
        System.out.println("Duration: " + durationInMinutes + " minutes");
        System.out.println("Included in the plan: " + (includedInThePlan ? "Yes" : "No"));
    }

    void Ratings (double rating) {
        totalRating += rating;
        System.out.println("Ratings: 8.5/10");
    }
}
