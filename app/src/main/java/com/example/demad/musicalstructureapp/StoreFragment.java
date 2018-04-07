package com.example.demad.musicalstructureapp;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class StoreFragment extends Fragment {

    public StoreFragment(){
        //Requires empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.store_list, container, false);
        final ArrayList<Store> stores = new ArrayList<>();

        stores.add(new Store(R.string.store_spotify,R.drawable.spotify));
        stores.add(new Store(R.string.store_google,R.drawable.googlepm));
        stores.add(new Store(R.string.store_itunes,R.drawable.itunes));
        stores.add(new Store(R.string.store_amazon,R.drawable.amazonm));

        StoreAdapter adapter = new StoreAdapter(getActivity(),stores,R.color.field_store);
        ListView listView = rootView.findViewById(R.id.store_list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(),"Going to the Online store",Toast.LENGTH_SHORT).show();
            }
        });
        listView.setDrawSelectorOnTop(true);
        return rootView;
    }
}

