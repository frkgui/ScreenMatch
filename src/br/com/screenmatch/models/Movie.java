package br.com.screenmatch.models;

public class Movie {
    private String nome;
    private int releaseYear;
    private boolean avaliablePlan;
    private double rateSum;
    private int rateTotal;
    private int durationInMinute;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public boolean isAvaliablePlan() {
        return avaliablePlan;
    }

    public void setAvaliablePlan(boolean avaliablePlan) {
        this.avaliablePlan = avaliablePlan;
    }

    public double getRateSum() {
        return rateSum;
    }

    public void setRateSum(double rateSum) {
        this.rateSum = rateSum;
    }

    public int getRateTotal() {
        return rateTotal;
    }

    public void setRateTotal(int rateTotal) {
        this.rateTotal = rateTotal;
    }

    public int getDurationInMinute() {
        return durationInMinute;
    }

    public void setDurationInMinute(int durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    @Override
    public String toString() {
        return "Name: " + this.nome + "\n" +
                "Realease year: " + this.releaseYear + "\n" +
                "Duration in minutes: "+ this.durationInMinute;
    }

    public void rateAdd(double userRate){
        this.rateSum += userRate;
        this.rateTotal++;
    }

    public double getRateAverage(){
        return this.getRateSum() / this.getRateTotal();
    }
}
