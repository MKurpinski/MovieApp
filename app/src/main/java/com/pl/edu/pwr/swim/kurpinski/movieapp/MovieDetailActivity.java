package com.pl.edu.pwr.swim.kurpinski.movieapp;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MovieDetailActivity extends FragmentActivity {
    @BindView(R.id.viewPager) ViewPager pager;
    private Movie movie;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie_details_view_pager);
        ButterKnife.bind(this);
        readMovieFromExtras();
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(),movie));
    }
    private void readMovieFromExtras() {
        movie = (Movie) getIntent().getSerializableExtra(Constants.SERIALIZABLE_MOVIE);
    }
}

