package br.com.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesNumber;
    private boolean active;
    private int episodesTime;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesNumber() {
        return episodesNumber;
    }

    public void setEpisodesNumber(int episodesNumber) {
        this.episodesNumber = episodesNumber;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesTime() {
        return episodesTime;
    }

    public void setEpisodesTime(int episodesTime) {
        this.episodesTime = episodesTime;
    }
}
