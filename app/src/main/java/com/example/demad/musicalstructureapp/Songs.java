package com.example.demad.musicalstructureapp;

/**
 * Created by demad on 21/03/2018.
 */

public class Songs {
    //    song
    private String mSong;
    //    artist
    private String mArtist;

    //  create a new Songs Object
    public Songs(String song, String artist) {
        mSong = song;
        mArtist = artist;
    }

    //get song
    public String getmSong() {
        return mSong;
    }

    //    get artist
    public String getmArtist() {
        return mArtist;
    }
}
