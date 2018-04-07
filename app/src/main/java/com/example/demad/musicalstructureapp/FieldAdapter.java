package com.example.demad.musicalstructureapp;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * {@link FieldAdapter} is a {@link FragmentPagerAdapter} that can provide the layout for
 * each list item based on a data source which is a list objects.
 */

public class FieldAdapter extends FragmentPagerAdapter {
    /**
     * Context of the app
     */
    private Context mContext;

    /**
     * Create a new {@link FieldAdapter} object.
     *
     * @param fragmentManager is the fragment manager that will keep each fragment's state in the adapter
     *                        across swipes.
     * @param context         is the context of the app
     */
    public FieldAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext = context;
    }

    /**
     * Return the {@link Fragment} that should be displayed for the given page number.
     */
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new SongsFragment();
        } else if (position == 1) {
            return new AlbumsFragment();
        } else if (position == 2) {
            return new ArtistsFragment();
        } else if (position == 3) {
            return new SearchFragment();
        } else {
            return new StoreFragment();
        }
    }

    /**
     * Return the total number of pages.
     */
    @Override
    public int getCount() {
        return 5;
    }

    /**
     * Return the proper category name per page.
     * mContext to turn string resource ID into an actual String
     */
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.field_songs);
        } else if (position == 1) {
            return mContext.getString(R.string.field_albums);
        } else if (position == 2) {
            return mContext.getString(R.string.field_artists);
        } else if (position == 3) {
            return mContext.getString(R.string.field_search);
        } else {
            return mContext.getString(R.string.field_store);
        }
    }
}
