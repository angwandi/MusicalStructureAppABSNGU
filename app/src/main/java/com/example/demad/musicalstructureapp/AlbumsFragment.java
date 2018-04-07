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

public class AlbumsFragment extends Fragment {
    public AlbumsFragment() {
        //Requires empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.album_grid, container, false);
        final ArrayList<Album> albums = new ArrayList<>();
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_1280));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.maitre));
        albums.add(new Album(R.string.album_title, R.string.album_artist, R.drawable.ic_1280));
        final AlbumAdapter adapter = new AlbumAdapter(getActivity(), albums, R.color.field_albums);
        final GridView gridView = rootView.findViewById(R.id.album_gridview);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "Click", Toast.LENGTH_LONG).show();
            }
        });
        gridView.setDrawSelectorOnTop(true);
        return rootView;
    }
}
