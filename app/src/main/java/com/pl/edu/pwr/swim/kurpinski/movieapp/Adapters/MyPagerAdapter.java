package com.pl.edu.pwr.swim.kurpinski.movieapp.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Models.Movie;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Activities.Fragments.MovieDescriptionFragment;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Activities.Fragments.MoviePicturesFragment;

/**
 * Created by michal on 04.05.2017.
 */

public class MyPagerAdapter extends FragmentPagerAdapter {
    private Movie movie;
    public MyPagerAdapter(FragmentManager fm, Movie movie) {
        super(fm);
        this.movie = movie;
    }

    @Override
    public Fragment getItem(int pos) {
        switch(pos) {
            case Constants.MOVIE_DESCRIPTION_INDEX: return MovieDescriptionFragment.newInstance(movie);
            case Constants.MOVIE_PICTURES_INDEX: return MoviePicturesFragment.newInstance(movie);
            default:return MovieDescriptionFragment.newInstance(movie);
        }
    }
    @Override
    public int getCount() {
        return Constants.NUMBER_OF_FRAGMENTS;
    }
}
