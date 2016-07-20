package com.example.android.coingrade;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainCoinGradeActivity extends AppCompatActivity {

    private static final int COLLECTION_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coin_grade);
    }

    public void selectCollectionButton(View view) {
        Intent intent = new Intent(this, selectCollection.class);
        /*intent.putExtra(VALUE, "my custom string value");*/
        startActivityForResult(intent, COLLECTION_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == COLLECTION_REQUEST_CODE) {
            // Make sure the request was successful
            if (resultCode == RESULT_OK) {
                // TODO
                // fetch the message String
                String message = data.getStringExtra("MESSAGE");
                TextView textview = (TextView)findViewById(R.id.catalog_select);
                textview.setText(message);
//                Toast.makeText(this, "" + message,
//                        Toast.LENGTH_SHORT).show();
            }
        }
    }
}
