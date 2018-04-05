package com.example.demad.musicalstructureapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumsFragment extends Fragment {
    public AlbumsFragment() {
        //Requires empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.album_grid, container, false);
        final ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title,R.string.album_artist,R.drawable.ic_music_note_black_48dp));

        AlbumAdapter adapter = new AlbumAdapter(getActivity(), albums, R.color.field_albums);
        GridView gridView = rootView.findViewById(R.id.gridview);
        gridView.setAdapter(adapter);
        return rootView;
    }
}
