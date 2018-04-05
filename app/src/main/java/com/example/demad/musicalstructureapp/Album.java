package com.example.demad.musicalstructureapp;

public class Album {
    /**
     * String resource ID for the album title
     */
    private int mAlbumTitle;
    /**
     * String resource ID for the Artist
     */
    private int mAlbumArtist;

    /**
     * Audio resource ID for the song
     */
    private int mAudioResourceId;
    /**
     * Image resource ID for the song
     */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    /**
     * Constant value that represents no image was provided for this song
     */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Song object
     *
     * @param albumTitle      is the string resource ID for the album title
     *                        <p>
     * @param albumArtist     is the string resource ID for the album artist
     * @param ImageResourceId is the string resource ID for the image of the album
     */
    public Album(int albumTitle, int albumArtist, int ImageResourceId) {
        mAlbumTitle = albumTitle;
        mAlbumArtist = albumArtist;
        mImageResourceId = ImageResourceId;
    }

    /**
     * Get the string resource ID for the album title
     */
    public int getAlbumTitle() {
        return mAlbumTitle;
    }

    /**
     * Get the string resource ID for the song Artist
     */
    public int getAlbumArtist() {
        return mAlbumArtist;
    }

    /**
     * Returns whether or not there is an image for this song.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the image resource ID of the song.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}

