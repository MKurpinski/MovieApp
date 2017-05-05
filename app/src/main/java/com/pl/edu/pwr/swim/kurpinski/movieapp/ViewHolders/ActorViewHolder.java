package com.pl.edu.pwr.swim.kurpinski.movieapp.ViewHolders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.pl.edu.pwr.swim.kurpinski.movieapp.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by michal on 04.05.2017.
 */

public class ActorViewHolder extends RecyclerView.ViewHolder {
    @BindView(R.id.actorData)public TextView actorData;
    @BindView(R.id.actorPhoto)public ImageView actorPhoto;

    public ActorViewHolder(View view) {
        super(view);
        ButterKnife.bind(this,view);
    }
}
