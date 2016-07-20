package com.example.android.coingrade;

/**
 * Created by DJP on 7/16/2016.
 * Collection class to manage working with collection data
 */
public class collection {

    private String[] mCollection = {
            "Add new catalog", "Dan's Home",
            "Purchased", "Proofs"
    };

    public String[] getGroup() {
        return mCollection;
    }

    public String member(int position) {
        return mCollection[position];
    }

    public int length() {
        return mCollection.length;
    }

    public int id(int position) {
        return (position);
    }
}
