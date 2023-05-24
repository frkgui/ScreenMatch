package br.com.screenmatch.calc;
import br.com.screenmatch.models.Movie;
import br.com.screenmatch.models.Series;


public class timeCalculator {
    private int totalTime;
    public int getTotalTime() {
        return totalTime;
    }
    public void include(Movie movie){
        this.totalTime += movie.getDurationInMinute();
    }

    public void include(Series serie){
        this.totalTime += serie.getDurationInMinute();
    }

}
