public class Main {

    public static void main(String[] args) {

        Movies movie1 = new Movies();
        movie1.title = "The Shawshank Redemption";
        movie1.releaseDate = 1994;
        movie1.durationInMinutes = 142;
        movie1.includedInThePlan = true;
        System.out.println("Movie Title: " + movie1.title + "\nThe release date was in the year " + movie1.releaseDate);
        movie1.printMovieDetails();
        movie1.Ratings(8.5);
        movie1.Ratings(9.0);
        System.out.println("Total Ratings: " + movie1.totalRating);

        Movies movie2 = new Movies();
        movie2.title = "The Godfather";
        movie2.releaseDate = 1972;
        movie2.durationInMinutes = 175;
        movie2.includedInThePlan = false;
        System.out.println("\nMovie Title: " + movie2.title + "\nThe release date was in the year " + movie2.releaseDate);
        movie2.printMovieDetails();

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


    }
}
