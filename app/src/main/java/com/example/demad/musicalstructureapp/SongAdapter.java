package com.example.demad.musicalstructureapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * <p>
 * based on a data source, which is a list of {@link Song} objects.
 */
public class SongAdapter extends ArrayAdapter<Song> {
    /**
     * Resource ID for the background color for this list of songs
     */
    private int mColorResourceId;

    /**
     * Create a new {@link SongAdapter} object.
     *
     * @param context         is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs           is the list of {@link Song}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of songs
     */
    public SongAdapter(Context context, ArrayList<Song> songs, int colorResourceId) {
        super(context, 0, songs);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_items, parent, false);
        }
        // Get the {@link Song} object located at this position in the list
        Song currentSong = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView songTitleTextView = listItemView.findViewById(R.id.songTitle_text_view);
        // Get the song title from the currentSong object and set this text on
        // the song title TextView.
        songTitleTextView.setText(currentSong.getSongTitle());
        //Repetition of same procedures for other element of the list_items
        TextView songArtistTextView = listItemView.findViewById(R.id.songArtist_text_view);
        songArtistTextView.setText(currentSong.getSongArtist());
        TextView songDurationTextView = listItemView.findViewById(R.id.songDuration_text_view);
        songDurationTextView.setText(currentSong.getSongDuration());
        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);
        return listItemView;
    }
}