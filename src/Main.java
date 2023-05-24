import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;
import br.com.screenmatch.models.Title;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie();
        movie.setNome("O Poderoso Chefão ");
        movie.setReleaseYear(1972);
        movie.setDurationInMinute(180);

        System.out.println("-/- Movie info -/-\n");
        System.out.println(movie.toString());

//      Movie user rating register
        movie.rateAdd(8);
        movie.rateAdd(5);
        movie.rateAdd(7.5);
        movie.rateAdd(10);

        System.out.println("\n-/- Rating info -/-");
        System.out.println("\nTotal: " + movie.getRateTotal());
        System.out.println("Average: " + movie.getRateAverage());

        System.out.println("\n---- / ----\n");

        Series simpsons = new Series();
        simpsons.setNome("Os Simpsons");
        simpsons.setReleaseYear(1989);
        simpsons.setSeasons(34);
        simpsons.setEpisodesNumber(12);
        simpsons.setEpisodesDuration(50);

        System.out.printf("Tempo total para finalizar: %d minutos",simpsons.getDurationInMinute());
    }
}
