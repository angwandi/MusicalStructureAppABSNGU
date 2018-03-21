package com.example.demad.musicalstructureapp;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BrowseActivity extends AppCompatActivity {

    Button home;
    Button search;
    Button store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);

        //find the view that shows the home button
        home = findViewById(R.id.btn_home);

        // Set a click listener on that View
        home.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {

                // Create a new intent to open the {@link NumbersActivity}
                Intent homeIntent = new Intent(BrowseActivity.this, MainActivity.class);

                // Start the new activity
                startActivity(homeIntent);
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
                Intent searchIntent = new Intent(BrowseActivity.this, SearchActivity.class);

                // Start the new activity
                startActivity(searchIntent);
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
                Intent storeIntent = new Intent(BrowseActivity.this, StoreActivity.class);

                // Start the new activity
                startActivity(storeIntent);
            }
        });

    }
}
