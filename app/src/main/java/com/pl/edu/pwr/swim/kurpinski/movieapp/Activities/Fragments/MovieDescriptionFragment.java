package com.pl.edu.pwr.swim.kurpinski.movieapp.Activities.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Models.Movie;
import com.pl.edu.pwr.swim.kurpinski.movieapp.R;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 03.05.2017.
 */

public class MovieDescriptionFragment extends Fragment {
    @BindView(R.id.descriptionTV) TextView descriptionTv;
    @BindView(R.id.title) TextView title;
    @BindView(R.id.ratingBar) RatingBar ratingBar;
    @BindView(R.id.imageView) ImageView imageView;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_movie_detail, container, false);
        ButterKnife.bind(this,v);
        fillInformationsAboutMovie((Movie)getArguments().getSerializable(Constants.SERIALIZABLE_MOVIE));
        return v;
    }

    public static MovieDescriptionFragment newInstance(Movie movie) {

        MovieDescriptionFragment movieFragment = new MovieDescriptionFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constants.SERIALIZABLE_MOVIE, movie);
        movieFragment.setArguments(bundle);
        return movieFragment;
    }
    private void fillInformationsAboutMovie(Movie movie){
        descriptionTv.setMovementMethod(new ScrollingMovementMethod());
        descriptionTv.setText(movie.getDescription());
        ratingBar.setNumStars(movie.getRating());
        title.setText(movie.getTitle());
        Picasso.with(this.getContext()).load(movie.getPhotoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
    }
}
