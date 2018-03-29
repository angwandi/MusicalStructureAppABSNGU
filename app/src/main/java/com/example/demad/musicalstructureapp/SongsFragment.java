package com.example.demad.musicalstructureapp;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SongsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.song_list, container,false);

        // Create a list of songs
        final ArrayList<Song> songs = new ArrayList<Song>();

        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));
        songs.add(new Song(R.string.song_title,R.string.song_artist,R.string.song_duration));

        return rootView;

    }
}
