package com.example.demad.musicalstructureapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.ArrayList;

public class ArtistsFragment extends Fragment {

    public ArtistsFragment(){
        //Requires empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.artist_grid, container, false);
        final ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_music_note_black_24dp));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist,R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist,R.drawable.ic_1280));

        ArtistAdapter adapter = new ArtistAdapter(getActivity(),artists,R.color.field_artists);
        GridView gridView = rootView.findViewById(R.id.artist_gridview);
        gridView.setAdapter(adapter);
        return rootView;
    }
}
