package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieDetailActivity extends AppCompatActivity {
    @BindView(R.id.descriptionTV) TextView descriptionTv;
    @BindView(R.id.titleTV) TextView titleTv;
    @BindView(R.id.ratingBar) RatingBar ratingBar;
    @BindView(R.id.imageView) ImageView imageView;
    private Movie movie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        ButterKnife.bind(this);
        readMovieFromExtras();
        fillInformationsAboutMovie();
    }
    private void readMovieFromExtras(){

        movie =(Movie) getIntent().getSerializableExtra("movie");
    }
    private void fillInformationsAboutMovie(){
        descriptionTv.setText(movie.getDescription());
        titleTv.setText(movie.getTitle());
        titleTv.setText(movie.getTitle());
        ratingBar.setNumStars(movie.getRating());
        imageView.setImageBitmap(BitmapFactory.decodeResource(getResources(), movie.getPhoto()));
    }
}
