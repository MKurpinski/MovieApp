package com.pl.edu.pwr.swim.kurpinski.movieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;
import android.widget.Toast;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.PrepareMovies;
import com.pl.edu.pwr.swim.kurpinski.movieapp.Interfaces.ClickListener;
import com.pl.edu.pwr.swim.kurpinski.movieapp.TouchHandlers.RecyclerTouchListener;
import com.pl.edu.pwr.swim.kurpinski.movieapp.TouchHandlers.SimpleItemTouchHelperCallback;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recycler_view) RecyclerView recyclerView;
    private MoviesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mAdapter = new MoviesAdapter(PrepareMovies.PrepareList(),this);
        SetUpTheRecyclerView();
        recyclerView.addOnItemTouchListener(getRecyclerTouchListener());
    }

    private void SetUpTheRecyclerView() {
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        ItemTouchHelper.Callback callback = new SimpleItemTouchHelperCallback(mAdapter);
        ItemTouchHelper touchHelper = new ItemTouchHelper(callback);
        touchHelper.attachToRecyclerView(recyclerView);
}
    private RecyclerTouchListener getRecyclerTouchListener(){
        return new RecyclerTouchListener(getApplicationContext(), recyclerView, getClickListener());
    }
    private ClickListener getClickListener(){
        return new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Intent i = mAdapter.onClick(position);
                i.setClass(view.getContext(),MovieDetailActivity.class);
                startActivity(i);
            }

            @Override
            public void onLongClick(View view, int position){
                mAdapter.onLongClick(position);
            }
        };
    }
}

