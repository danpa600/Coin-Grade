package com.example.android.coingrade;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

/**
 * Created by DJP on 6/28/2016.
 */
public class selectCollection extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.collection_select_window);
        /* define the size of the select catalog popup window */
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int)(width*.8), (int)(height*.7));

        GridView gridview = (GridView) findViewById(R.id.collectionSelectGridView);

        final selectCollectionAdapter mAdapter = new selectCollectionAdapter(this);
        gridview.setAdapter(mAdapter);
        /*gridview.setAdapter(new selectCollectionAdapter(this));*/

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                Toast.makeText(selectCollection.this, "" + position,
                        Toast.LENGTH_SHORT).show();
                /*
                // get the Entered  message
                String message2="GO DAN GO";
                String message = mAdapter.Group.member(position);
                Intent intentMessage=new Intent();
                // put the message to return as result in Intent
                intentMessage.putExtra("MESSAGE",message);
                // Set The Result in Intent
                setResult(RESULT_OK,intentMessage);
                // finish The activity
                finish();
                */
            }
        });
    }

    /* Close the catalog selection when the user selects the Cancel button */
    public void cancelCollectionSelect(View view) {
        finish();
    }
}
