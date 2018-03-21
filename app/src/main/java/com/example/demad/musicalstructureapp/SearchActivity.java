package com.example.demad.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SearchActivity extends AppCompatActivity {

    Button home;
    Button browse;
    Button store;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        //find the view that shows the home button
        home = findViewById(R.id.btn_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}
                Intent homeIntent = new Intent(SearchActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
            }
        });

        //find the view that shows the browse button
        browse = findViewById(R.id.btn_browse);

        // Set a click listener on that View
        browse.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}
                Intent browseIntent = new Intent(SearchActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });


        //find the view that shows the store button
        store = findViewById(R.id.btn_store);

        // Set a click listener on that View
        store.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}
                Intent storeIntent = new Intent(SearchActivity.this, StoreActivity.class);

                // Start the new activity
                startActivity(storeIntent);
            }
        });
    }
}
