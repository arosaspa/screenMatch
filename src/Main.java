import com.java.screenMatch.models.Movies;
import com.java.screenMatch.models.Series;

public class Main {

    public static void main(String[] args) {

        //*********************************************************************\\
        // Movies of my screenMatch

        Movies movie1 = new Movies();
        movie1.setTitle("The Shawshank Redemption");
        movie1.releaseDate = 1994;
        movie1.setDurationInMinutes(142);
        movie1.setincludedInThePlan(true);
        System.out.println("Movie Title: " + movie1.title + "\nThe release date was in the year " + movie1.releaseDate);
        movie1.setDirector("Frank Darabont");
        movie1.setRating(8.5);
        movie1.setRating(9.0);
        movie1.setRating(8.0);
        System.out.println("Total Ratings: " + movie1.getSumOfRatings());

        Movies movie2 = new Movies();
        movie2.title = "The Godfather";
        movie2.releaseDate = 1972;
        movie2.durationInMinutes = 175;
        movie2.includedInThePlan = false;
        System.out.println("\nMovie Title: " + movie2.getTitle() + "\nThe release date was in the year " + movie2.releaseDate);

        Movies movie3 = new Movies();
        movie3.title = "Matrix 1";
        movie3.releaseDate = 1999;
        movie3.durationInMinutes = 136;
        movie3.includedInThePlan = true;
        System.out.println("\nMovie Title: " + movie3.title + "\nThe release date was in the year " + movie3.releaseDate);

        Movies movie4 = new Movies();
        movie4.title = "Matrix 2";
        movie4.releaseDate = 2003;
        movie4.durationInMinutes = 138;
        movie4.includedInThePlan = false;
        System.out.println("\nMovie Title: " + movie4.title + "\nThe release date was in the year " + movie4.releaseDate);


        //********************************************************************\\
        // Series of my screenMatch

        Series the4400 = new Series();
        the4400.setTitle("The 4400");
        the4400.setReleaseDate(2004);
        the4400.setDurationInMinutes(60);
        the4400.setIncludedInThePlan(true);
        the4400.setSeasons(4);
        the4400.setMinutesForEpisode(70);
        System.out.println("\nSeries Title: " + the4400.getTitle() + "\nThe release date was in the year " + the4400.getReleaseDate() + "\nThe number of minutes of duration is: " + the4400.getDurationInMinutes());









    }
}
