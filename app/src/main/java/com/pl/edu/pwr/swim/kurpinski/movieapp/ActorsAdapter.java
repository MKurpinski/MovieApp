package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Interfaces.ItemTouchHelperAdapter;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by michal on 04.05.2017.
 */

public class ActorsAdapter extends RecyclerView.Adapter<ActorViewHolder> implements ItemTouchHelperAdapter {

    private Context context;
    private List<Actor> actorList;

    public ActorsAdapter(Actor actor, Context context) {
        prepareData(actor);
        this.context = context;
    }

    private void prepareData(Actor actor) {
        actorList = new ArrayList<>();
        actorList.add(actor);
        actorList.add(new Actor());
        actorList.add(new Actor());
    }

    @Override
    public ActorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.actor_view, parent, false);
        return new ActorViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ActorViewHolder holder, int position) {
        Actor actor = actorList.get(position);
        holder.actorData.setText(actor.getName());
        Picasso.with(context).load(actor.getPhotoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.actorPhoto);
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return actorList.size();
    }

    @Override
    public void onItemDismiss(int position, int direction) {

    }
}
