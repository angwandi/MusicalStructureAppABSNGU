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

public class AlbumAdapter extends ArrayAdapter<Album> {
    private int mColorResourceId;

    public AlbumAdapter(Context context, ArrayList<Album> albums, int colorResourceId) {
        super(context, 0, albums);
        mColorResourceId = colorResourceId;
    }

    @Nullable
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View gridItemView = convertView;
        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_items, parent, false);
        }
        Album currentAlbum = getItem(position);
        TextView albumTtile = gridItemView.findViewById(R.id.albumTitle_text_view);
        albumTtile.setText(currentAlbum.getAlbumTitle());
        TextView albumArtist = gridItemView.findViewById(R.id.albumArtist_text_view);
        albumArtist.setText(currentAlbum.getAlbumArtist());
        ImageView imageView = gridItemView.findViewById(R.id.album_image);
        if (currentAlbum.hasImage()) {
            imageView.setImageResource(currentAlbum.getImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        View textContainer = gridItemView.findViewById(R.id.album_text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        textContainer.setBackgroundColor(color);
        return gridItemView;
    }
}
