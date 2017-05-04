package com.pl.edu.pwr.swim.kurpinski.movieapp;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;

import java.io.Serializable;

/**
 * Created by michal on 04.05.2017.
 */

public class Actor implements Serializable {
    private String name;
    private String photoUrl;
    public String getName(){
        return name;
    }
    public Actor(){
        name = Constants.DEFAULT_ACTOR;
        photoUrl = Constants.DEFAULT_ACTOR_PHOTOURL;
    }
    public Actor(String name, String url){
        this.name = name;
        this.photoUrl = url;
    }
    public String getPhotoUrl(){
        return photoUrl;
    }
}
