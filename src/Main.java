import br.com.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setNome("O Poderoso Chefão ");
        movie.setReleaseYear(1972);
        movie.setDurationInMinute(180);

        System.out.println("-/- br.com.screenmatch.models.Movie info -/-\n");
        System.out.println(movie.toString());

//        User rating register

        movie.rateAdd(8);
        movie.rateAdd(5);
        movie.rateAdd(7.5);
        movie.rateAdd(10);

        System.out.println("\n-/- Rating info -/-");
        System.out.println("\nTotal: " + movie.getRateTotal());
        System.out.println("Average: " + movie.getRateAverage());
    }
}
