package com.pl.edu.pwr.swim.kurpinski.movieapp.Activities.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Adapters.ActorsAdapter;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Adapters.ImageAdapter;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Models.Actor;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Models.Movie;
import com.pl.edu.pwr.swim.kurpinski.movieapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 03.05.2017.
 */

public class MoviePicturesFragment extends Fragment {
    @BindView(R.id.recyclerActors) RecyclerView recyclerView;
    @BindView(R.id.gridView) GridView gridView;
    ImageAdapter myImageAdapter;
    private ActorsAdapter mAdapter;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.movie_pictures_fragment, container, false);
        ButterKnife.bind(this,v);
        fillInformationsAboutMovie((Movie)getArguments().getSerializable(Constants.SERIALIZABLE_MOVIE));
        gridView.setAdapter(myImageAdapter);
        SetUpTheRecyclerView();
        return v;
    }
    public static MoviePicturesFragment newInstance(Movie movie) {

        MoviePicturesFragment movieFragment = new MoviePicturesFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.SERIALIZABLE_MOVIE, movie);
        movieFragment.setArguments(bundle);
        return movieFragment;
    }
    private void SetUpTheRecyclerView() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(this.getContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
    private void fillInformationsAboutMovie(Movie movie){
        mAdapter = new ActorsAdapter(new Actor(movie.getActorData(), movie.getActorPhotoUrl()),this.getContext());
        myImageAdapter = new ImageAdapter(this.getContext(), movie.getPhotoUrl());
    }
}
