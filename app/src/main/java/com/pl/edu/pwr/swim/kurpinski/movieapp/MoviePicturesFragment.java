package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 03.05.2017.
 */

public class MoviePicturesFragment extends Fragment {
    @BindView(R.id.gridView) GridView gridView;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.movie_pictures_fragment, container, false);
        ButterKnife.bind(this,v);
        fillInformationsAboutMovie((Movie)getArguments().getSerializable(Constants.SERIALIZABLE_MOVIE));
        return v;
    }
    public static MoviePicturesFragment newInstance(Movie movie) {

        MoviePicturesFragment movieFragment = new MoviePicturesFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.SERIALIZABLE_MOVIE, movie);
        movieFragment.setArguments(bundle);
        return movieFragment;
    }
    private void fillInformationsAboutMovie(Movie movie){
    }
}
