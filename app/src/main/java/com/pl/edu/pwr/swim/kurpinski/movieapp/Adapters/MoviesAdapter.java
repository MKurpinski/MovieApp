package com.pl.edu.pwr.swim.kurpinski.movieapp.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Interfaces.ItemTouchHelperAdapter;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Models.Movie;
import com.pl.edu.pwr.swim.kurpinski.movieapp.R;
import com.pl.edu.pwr.swim.kurpinski.movieapp.ViewHolders.MovieViewHolder;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by michal on 04.04.2017.
 */

public class MoviesAdapter extends RecyclerView.Adapter<MovieViewHolder> implements ItemTouchHelperAdapter {

    private boolean canLongClick = false;
    private Activity activity;
    private List<Movie> moviesList;

    public MoviesAdapter(List<Movie> moviesList, Activity activity) {
        this.moviesList = moviesList;
        this.activity = activity;
    }

    @Override
    public MovieViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(viewType%2==0? R.layout.movie_list_row_left:R.layout.movie_list_row_right, parent, false);
        return new MovieViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MovieViewHolder holder, int position) {
        Movie movie = moviesList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
        Picasso.with(activity.getApplicationContext()).load(movie.getPhotoUrl())
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.photo);
        holder.viewed.setVisibility(movie.getViewed() ? View.VISIBLE : View.GONE);
    }
    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return moviesList.size();
    }

    @Override
    public void onItemDismiss(int position, int direction){
        moviesList.remove(position);
        canLongClick = false;
        notifyItemRemoved(position);
    }
    public void onLongClick(int position){
        if(canLongClick){
            Movie movie = moviesList.get(position);
            movie.setViewed(!movie.getViewed());
            notifyItemChanged(position);
        }else{
            canLongClick = true;
        }
    }
    public Intent onClick(int position){
        Movie movie = moviesList.get(position);
        Intent intent = new Intent();
        intent.putExtra(Constants.SERIALIZABLE_MOVIE,movie);
        return intent;
    }
}
