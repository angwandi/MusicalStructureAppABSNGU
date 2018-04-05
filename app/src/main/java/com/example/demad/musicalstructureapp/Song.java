package com.example.demad.musicalstructureapp;

public class Song {

    /**
     * String resource ID for the song title
     */

    private int mSongTitle;

    /**
     * String resource ID for the Artist
     */

    private int mSongArtist;

    /**
     * String resource ID for the song duration
     */

    private int mSongDuration;

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
     * @param songTitle     is the string resource ID for the song title
     *                  <p>
     * @param songArtist    is the string resource ID for the artist
     * @param songDuration  is the string resource ID for the duration of the song
     */

    public Song(int songTitle, int songArtist, int songDuration){
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongDuration = songDuration;
    }
    public Song(int songTitle, int songArtist, int imageResourceId, int songDuration){
        mSongTitle = songTitle;
        mSongArtist = songArtist;
        mSongDuration = songDuration;
        mImageResourceId = imageResourceId;
    }
    /**
     * Get the string resource ID for the song title
     */

    public int getSongTitle(){return mSongTitle;}

    /**
     * Get the string resource ID for the song Artist
     */
    public int getSongArtist(){return mSongArtist;}

    /**
     * Get the string resource ID for the song duration
     */
    public int getSongDuration(){return  mSongDuration;}

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
