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
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015","http://www.madmaxmovies.com/mad-max-fury-road/soundtrack/mad-max-fury-road-soundtrack.jpg");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015","http://www.cartoonbrew.com/wp-content/uploads/2014/10/insideout-teaser-2-580x328.jpg");
        movieList.add(movie);

        movie = new Movie("Star Wars: Episode VII - The Force Awakens", "Action", "2015","https://media.starwars.ea.com/content/starwars-ea-com/pl_PL/starwars/battlefront/news-articles/star-wars-battlefront-beta-tips-and-tricks--multiplayer-/_jcr_content/featuredImage/renditions/rendition1.img.jpg");
        movieList.add(movie);

        return movieList;
    }
}
