package com.practice.DesignModeUsage.serviceDesignMode.flyweight_mode.example;

public class CD {
    private String title;
    private int year;
    private Artist artist;
    public String getTitle() { return title;}
    public int getYear() { return year; }
    public Artist getArtist() { return artist; }
    public void setTitle(String t) { title = t;}
    public void setYear(int y) {year = y;}
    public void setArtist(Artist a) {artist = a;}
}
