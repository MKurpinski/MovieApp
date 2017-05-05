package com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Models.Movie;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 04.04.2017.
 */

public class PrepareMovies {
    public static List<Movie> PrepareList(){
        List<Movie> movieList = new ArrayList<Movie>();
        Movie movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015","http://www.madmaxmovies.com/mad-max-fury-road/soundtrack/mad-max-fury-road-soundtrack.jpg","Brad Pitt","http://img.timeinc.net/time/time100/2007/images/brad_pitt.jpg");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015","http://www.cartoonbrew.com/wp-content/uploads/2014/10/insideout-teaser-2-580x328.jpg","Angelina Jolie", "http://i.huffpost.com/gadgets/slideshows/364692/slide_364692_4135590_free.jpg");
        movieList.add(movie);
        movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015","http://www.madmaxmovies.com/mad-max-fury-road/soundtrack/mad-max-fury-road-soundtrack.jpg","Brad Pitt","http://img.timeinc.net/time/time100/2007/images/brad_pitt.jpg");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015","http://www.cartoonbrew.com/wp-content/uploads/2014/10/insideout-teaser-2-580x328.jpg","Angelina Jolie", "http://i.huffpost.com/gadgets/slideshows/364692/slide_364692_4135590_free.jpg");
        movieList.add(movie);
        movie = new Movie("Mad Max: Fury Road", "Action & Adventure", "2015","http://www.madmaxmovies.com/mad-max-fury-road/soundtrack/mad-max-fury-road-soundtrack.jpg","Brad Pitt","http://img.timeinc.net/time/time100/2007/images/brad_pitt.jpg");
        movieList.add(movie);

        movie = new Movie("Inside Out", "Animation, Kids & Family", "2015","http://www.cartoonbrew.com/wp-content/uploads/2014/10/insideout-teaser-2-580x328.jpg","Angelina Jolie", "http://i.huffpost.com/gadgets/slideshows/364692/slide_364692_4135590_free.jpg");
        movieList.add(movie);


        return movieList;
    }
}
