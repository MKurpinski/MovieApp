package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 21.04.2017.
 */

public class MyViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.title) TextView title;
    @BindView(R.id.year) TextView year;
    @BindView(R.id.genre) TextView genre;
    @BindView(R.id.photo)ImageView photo;
    @BindView(R.id.eye)ImageView viewed;

    public MyViewHolder(View view) {
        super(view);
        ButterKnife.bind(this,view);
    }
}
