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
    private Actor actor;
    private int rating;
    private boolean viewed;

    public Movie(String title, String genre, String year, String photoUrl, String actorData, String actorPhotoUrl) {
        this.title = title;
        this.genre = genre;
        this.year = year;
        this.photoUrl = photoUrl;
        this.viewed = false;
        this.rating = 0;
        this.description = Constants.DEFAULT_DESCRIPTION;
        this.actor = new Actor(actorData,actorPhotoUrl);
    }

    public String getTitle() {
        return title;
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
    public String getDescription() {
        return description;
    }
    public String getGenre() {
        return genre;
    }
    public String getPhotoUrl() {
        return photoUrl;
    }
    public int getRating() {
        return rating;
    }
    public String getActorData() {
        return actor.getName();
    }
    public String getActorPhotoUrl(){
        return actor.getPhotoUrl();
    }
}
