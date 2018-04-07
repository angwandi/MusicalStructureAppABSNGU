package com.example.demad.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class StoreAdapter extends ArrayAdapter<Store> {

    private int mColorResourceId;
    public StoreAdapter (Context context, ArrayList<Store> stores, int colorResourceId){
        super(context,0,stores);
        mColorResourceId = colorResourceId;
    }

    @NonNull
    @Nullable
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.store_items, parent, false);
        }

        Store currentStore = getItem(position);
        TextView storeNameTextView = listItemView.findViewById(R.id.storeName_text_view);
        storeNameTextView.setText(currentStore.getmStoreName());
        ImageView imageView = listItemView.findViewById(R.id.store_image);
        imageView.setImageResource(currentStore.getmImageResourceId());
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
}
}
