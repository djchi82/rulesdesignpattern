package com.tenmilesquare.ryan.rulesdesignpattern;

public class Recording {

    public enum RECORDING_VERSIONS{
        v1,
        v2
    }
    private RECORDING_VERSIONS version;
    private String title;
    private String composer;
    private String duration;
    private String artist;
    private String lyrics;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RECORDING_VERSIONS getVersion() {
        return version;
    }

    public void setVersion(RECORDING_VERSIONS version) {
        this.version = version;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
}
