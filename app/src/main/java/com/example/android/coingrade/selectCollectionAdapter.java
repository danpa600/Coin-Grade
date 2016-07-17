package com.example.android.coingrade;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by DJP on 7/10/2016.
 */
public class selectCollectionAdapter extends BaseAdapter {
    private Context mContext;
    public collection Group = new collection();

    public selectCollectionAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return Group.length();
    }

    public Object getItem(int position) {
        return Group.member(position);
    }

    public long getItemId(int position) {
        return (position);
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        TextView textView;
        if (convertView == null) {
            textView = new TextView(mContext);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 21);
            textView.append(Group.member(position));
        }
        else {
            textView = (TextView) convertView;
        }

        return textView;
    }

}