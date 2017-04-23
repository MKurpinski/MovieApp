package com.pl.edu.pwr.swim.kurpinski.movieapp.Interfaces;

/**
 * Created by michal on 21.04.2017.
 */

import android.view.View;

public interface ClickListener {
    void onClick(View view, int position);

    void onLongClick(View view, int position);
}