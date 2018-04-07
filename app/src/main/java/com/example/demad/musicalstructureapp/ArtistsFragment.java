package com.example.demad.musicalstructureapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;
//Same description as of Song Adapter, Fragment and class  for reference

public class ArtistsFragment extends Fragment {
    public ArtistsFragment() {
        //Requires empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.artist_grid, container, false);
        final ArrayList<Artist> artists = new ArrayList<>();
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_1280));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_280));
        artists.add(new Artist(R.string.album_artist, R.drawable.maitre));
        artists.add(new Artist(R.string.album_artist, R.drawable.ic_1280));
        ArtistAdapter adapter = new ArtistAdapter(getActivity(), artists, R.color.field_artists);
        GridView gridView = rootView.findViewById(R.id.artist_gridview);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Click", Toast.LENGTH_SHORT).show();
            }
        });
        gridView.setDrawSelectorOnTop(true);
        return rootView;
    }
}
