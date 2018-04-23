package com.example.demad.musicalstructureapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of songs.
 */
public class SongsFragment extends Fragment {
    public SongsFragment() {
        //Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.song_list, container, false);
        // Create a list of songs
        final ArrayList<Song> songs = new ArrayList<Song>();
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_1280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.maitre, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_1280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.maitre, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_1280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.maitre, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_1280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.maitre, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_1280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.maitre, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.ic_1280, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.drawable.maitre, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        songs.add(new Song(R.string.song_title, R.string.song_artist, R.string.song_duration));
        // Create an {@link SongAdapter}, whose data source is a list of {@link Song}s. The
        // adapter knows how to create list items for each item in the list.
        SongAdapter adapter = new SongAdapter(getActivity(), songs, R.color.field_songs);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link SongAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Will play after the next Update!", Toast.LENGTH_LONG).show();
            }
        });
        //For the pressed states on the list item view
        listView.setDrawSelectorOnTop(true);
        return rootView;
    }
}
