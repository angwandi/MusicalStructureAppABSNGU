package com.example.demad.musicalstructureapp;

public class Artist {
    private int mArtistName;
    private int mImageResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Artist (int artistName,int ImageResourceId){
        mArtistName = artistName;
        mImageResourceId = ImageResourceId;
    }

    public int getArtistName() {
        return mArtistName;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

}
