package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.graphics.Bitmap;

import java.io.Serializable;

/**
 * Created by michal on 04.04.2017.
 */
public class Movie implements Serializable {
    private String title, genre, year, description;
    private int photo;
    private int rating;
    private boolean viewed;

    public Movie(String title, String genre, String year, int photo) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.photo = photo;
        this.viewed = false;
        this.rating = 0;
        this.description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin accumsan non elit in imperdiet. " +
                "Pellentesque mollis eros et elit venenatis, non condimentum ex malesuada. Interdum " +
                "et malesuada fames ac ante ipsum primis in faucibus. Phasellus elit velit, interdum " +
                "ac dignissim at, posuere in diam. Integer luctus nec sem ac finibus.";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public boolean getViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}
