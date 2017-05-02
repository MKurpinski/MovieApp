package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.graphics.Bitmap;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;

import java.io.Serializable;

/**
 * Created by michal on 04.04.2017.
 */
public class Movie implements Serializable {
    private String title, genre, year, description;
    private String photoUrl;
    private int rating;
    private boolean viewed;

    public Movie(String title, String genre, String year, String photoUrl) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.photoUrl = photoUrl;
        this.viewed = false;
        this.rating = 0;
        this.description = Constants.DEFAULT_DESCRIPTION;
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

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }
    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
}
