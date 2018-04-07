package com.example.demad.musicalstructureapp;

public class Store {
    private int mStoreName;
    private int mImageResourceId;

    public Store (int storeName, int ImageResourceId){
        mStoreName = storeName;
        mImageResourceId = ImageResourceId;
    }

    public int getmStoreName() {
        return mStoreName;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }
}
