package com.pl.edu.pwr.swim.kurpinski.movieapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pl.edu.pwr.swim.kurpinski.movieapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 21.04.2017.
 */

public class MovieViewHolder extends RecyclerView.ViewHolder {

    @BindView(R.id.title)public TextView title;
    @BindView(R.id.year)public TextView year;
    @BindView(R.id.genre)public TextView genre;
    @BindView(R.id.photo)public ImageView photo;
    @BindView(R.id.eye)public ImageView viewed;

    public MovieViewHolder(View view) {
        super(view);
        ButterKnife.bind(this,view);
    }
}
