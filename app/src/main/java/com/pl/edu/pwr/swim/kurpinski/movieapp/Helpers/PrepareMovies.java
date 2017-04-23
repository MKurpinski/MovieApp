package com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers;

import android.app.Activity;
import android.graphics.BitmapFactory;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Movie;
import com.pl.edu.pwr.swim.kurpinski.movieapp.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 04.04.2017.
 */

public class PrepareMovies {
    public static List<Movie> PrepareList(){
        List<Movie> movieList = new ArrayList<Movie>();
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015",R.mipmap.ic_launcher);
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015",R.mipmap.ic_launcher);
        movieList.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015",R.mipmap.ic_launcher);
        movieList.add(movie);

//        movie = new Movie("Shaun the Sheep", "Animation", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("The Martian", "Science Fiction & Fantasy", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Mission: Impossible Rogue Nation", "Action", "2015");
//        movieList.add(movie);
//
//        movie = new Movie("Up", "Animation", "2009");
//        movieList.add(movie);
//
//        movie = new Movie("Star Trek", "Science Fiction", "2009");
//        movieList.add(movie);
//
//        movie = new Movie("The LEGO Movie", "Animation", "2014");
//        movieList.add(movie);
//
//        movie = new Movie("Iron Man", "Action & Adventure", "2008");
//        movieList.add(movie);
//
//        movie = new Movie("Aliens", "Science Fiction", "1986");
//        movieList.add(movie);
//
//        movie = new Movie("Chicken Run", "Animation", "2000");
//        movieList.add(movie);
//
//        movie = new Movie("Back to the Future", "Science Fiction", "1985");
//        movieList.add(movie);
//
//        movie = new Movie("Raiders of the Lost Ark", "Action & Adventure", "1981");
//        movieList.add(movie);
//
//        movie = new Movie("Goldfinger", "Action & Adventure", "1965");
//        movieList.add(movie);
//
//        movie = new Movie("Guardians of the Galaxy", "Science Fiction & Fantasy", "2014");
//        movieList.add(movie);
        return movieList;
    }
}
