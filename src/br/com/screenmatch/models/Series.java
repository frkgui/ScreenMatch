package br.com.screenmatch.models;

public class Series extends Title {
    private int seasons;
    private int episodesNumber;
    private boolean active;
    private int episodesDuration;

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

    public int getEpisodesDuration() {
        return episodesDuration;
    }

    public void setEpisodesDuration(int episodesDuration) {
        this.episodesDuration = episodesDuration;
    }

    @Override
    public int getDurationInMinute() {
        return seasons * episodesNumber * episodesDuration;
    }
}
