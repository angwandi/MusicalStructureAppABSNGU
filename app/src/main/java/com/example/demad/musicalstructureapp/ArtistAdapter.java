package com.example.demad.musicalstructureapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ArtistAdapter extends ArrayAdapter<Artist> {
    private int mColorResourceId;

    public ArtistAdapter(Context context, ArrayList<Artist> artists, int colorResourceId) {
        super(context, 0, artists);
        mColorResourceId = colorResourceId;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.artist_items, parent, false);
        }
        Artist currentArtist = getItem(position);
        TextView artistTitle = gridItemView.findViewById(R.id.artistTitle_text_view);
        artistTitle.setText(currentArtist.getArtistName());
        ImageView imageView = gridItemView.findViewById(R.id.artist_image);
        if (currentArtist.hasImage()) {
            imageView.setImageResource(currentArtist.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = gridItemView.findViewById(R.id.artistTitle_text_view);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return gridItemView;
    }
}
