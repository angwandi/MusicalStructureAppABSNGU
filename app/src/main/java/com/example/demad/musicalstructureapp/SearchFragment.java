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

//Same description as of Song Adapter, Fragment and class  for reference

public class SearchFragment extends Fragment {

    public SearchFragment(){
        //Requires empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.search_view, container, false);
        return rootView;
    }
}
