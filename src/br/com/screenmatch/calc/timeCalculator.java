package br.com.screenmatch.calc;
import br.com.screenmatch.models.Title;

public class timeCalculator {
    private int totalTime;
    public int getTotalTime() {
        return totalTime;
    }
    public void include(Title title){
        this.totalTime += title.getDurationInMinute();
    }

}
