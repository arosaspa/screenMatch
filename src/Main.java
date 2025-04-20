import com.java.screenMatch.calc.calcOfTime;
import com.java.screenMatch.calc.filter;
import com.java.screenMatch.models.Episode;
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
        System.out.println("Total Ratings: " + movie1.getTotalRating());

        Movies movie2 = new Movies();
        movie2.title = "The Godfather";
        movie2.releaseDate = 1972;
        movie2.durationInMinutes = 175;
        movie2.setIncludedInThePlan(false);
        System.out.println("\nMovie Title: " + movie2.getTitle() + "\nThe release date was in the year " + movie2.releaseDate);
        movie2.setDirector("Francis Ford Coppola");
        movie2.setRating(9.2);
        movie2.setRating(9.5);
        movie2.setRating(9.0);
        System.out.println("Total Ratings: " + movie2.getTotalRating());

        Movies movie3 = new Movies();
        movie3.title = "Matrix 1";
        movie3.releaseDate = 1999;
        movie3.durationInMinutes = 136;
        movie3.setIncludedInThePlan(true);
        System.out.println("\nMovie Title: " + movie3.title + "\nThe release date was in the year " + movie3.releaseDate);

        Movies movie4 = new Movies();
        movie4.title = "Matrix 2";
        movie4.releaseDate = 2003;
        movie4.durationInMinutes = 138;
        movie4.setIncludedInThePlan(false);
        System.out.println("\nMovie Title: " + movie4.title + "\nThe release date was in the year " + movie4.releaseDate);


        //********************************************************************\\
        // Series of my screenMatch

        Series serie1 = new Series();
        serie1.setTitle("The X-Files");
        serie1.setReleaseDate(1993);
        serie1.setDurationInMinutes(45);
        serie1.setIncludedInThePlan(false);
        serie1.setSeasons(11);
        serie1.setMinutesForEpisode(45);
        System.out.println("\nSeries Title: " + serie1.getTitle() + "\nThe release date was in the year " + serie1.getReleaseDate() + "\nThe number of minutes of duration is: " + serie1.getDurationInMinutes());


        Series serie2 = new Series();
        serie2.setTitle("The 4400");
        serie2.setReleaseDate(2004);
        serie2.setDurationInMinutes(60);
        serie2.setIncludedInThePlan(true);
        serie2.setSeasons(4);
        serie2.setMinutesForEpisode(70);
        System.out.println("\nSeries Title: " + serie2.getTitle() + "\nThe release date was in the year " + serie2.getReleaseDate() + "\nThe number of minutes of duration is: " + serie2.getDurationInMinutes());



        //*********************************************************************\\
        // class and method calcOfTime

        calcOfTime calc = new calcOfTime();
        calc.include(movie1);
        calc.include(movie2);
        calc.include(movie3);
        calc.include(serie1);
        calc.include(serie2);
        System.out.println("\nThe total time of the movies and series is: " + calc.getTotalTime() + " minutes");

        //*********************************************************************\\

        filter filter = new filter();
        filter.filter(movie1);
        filter.filter(movie2);
        filter.filter(movie3);








    }
}
