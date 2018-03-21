package com.example.demad.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StoreActivity extends AppCompatActivity {

    Button home;
    Button browse;
    Button search;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);


        //find the view that shows the home button
        home = findViewById(R.id.btn_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}
                Intent homeIntent = new Intent(StoreActivity.this, MainActivity.class);

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
                Intent browseIntent = new Intent(StoreActivity.this, BrowseActivity.class);

                // Start the new activity
                startActivity(browseIntent);
            }
        });

        //find the view that shows the search button
        search = findViewById(R.id.btn_search);

        // Set a click listener on that View
        search.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}
                Intent searchIntent = new Intent(StoreActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
            }
        });


    }
}
