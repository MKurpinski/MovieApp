package com.pl.edu.pwr.swim.kurpinski.movieapp.Adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.pl.edu.pwr.swim.kurpinski.movieapp.Helpers.Constants;
import com.pl.edu.pwr.swim.kurpinski.movieapp.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by michal on 04.05.2017.
 */

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    ArrayList<String> itemList = new ArrayList<String>();

    public ImageAdapter(Context c, String movieUrl) {
        mContext = c;
        prepareList(movieUrl);
    }
    void add(String path){
        itemList.add(path);
    }

    @Override
    public int getCount() {
        return itemList.size();
    }

    @Override
    public Object getItem(int arg0) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(Constants.LAYOUT_DIMENSION, Constants.LAYOUT_DIMENSION));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(Constants.PADDING, Constants.PADDING, Constants.PADDING, Constants.PADDING);
        } else {
            imageView = (ImageView) convertView;
        }

        Picasso.with(mContext).load(itemList.get(position))
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
        return imageView;
    }

    private void prepareList(String movieUrl) {
        itemList.add(movieUrl);
        prepareFakeData();
    }
    private void prepareFakeData(){
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
        itemList.add("http://lorempixel.com/output/nature-q-c-640-480-7.jpg");
        itemList.add("http://lorempixel.com/output/abstract-q-c-640-480-6.jpg");
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
        itemList.add("http://lorempixel.com/output/nature-q-c-640-480-7.jpg");
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
        itemList.add("http://lorempixel.com/output/nature-q-c-640-480-7.jpg");
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
        itemList.add("http://lorempixel.com/output/sports-q-c-640-480-3.jpg");
    }

}
