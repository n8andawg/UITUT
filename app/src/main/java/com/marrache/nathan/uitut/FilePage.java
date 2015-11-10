package com.marrache.nathan.uitut;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class FilePage extends Activity {

    private static String logtag = "FilePageButtons";//for use as the tag when logging

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.file_page);

        Button buttonLoad = (Button)findViewById(R.id.buttonLoad);
        buttonLoad.setOnClickListener(loadListener); // Register the onClick listener with the implementation above

        Button buttonSave = (Button)findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(saveListener); // Register the onClick listener with the implementation above

        Button buttonRecord = (Button)findViewById(R.id.buttonRecord);
        buttonRecord.setOnClickListener(recordListener); // Register the onClick listener with the implementation above

        Button buttonPlay = (Button)findViewById(R.id.buttonPlay);
        buttonPlay.setOnClickListener(playListener); // Register the onClick listener with the implementation above
    }

    //Create an anonymous implementation of OnClickListener
    private View.OnClickListener loadListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d(logtag, "onClick() called - load button");
            Toast.makeText(FilePage.this, "The Load button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended - load button");
        }
    };

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener saveListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d(logtag,"onClick() called - save button");
            Toast.makeText(FilePage.this, "The Save button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended - save button");
        }
    };

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener recordListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d(logtag,"onClick() called - record button");
            Toast.makeText(FilePage.this, "The Record button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended - record button");
        }
    };

    // Create an anonymous implementation of OnClickListener
    private View.OnClickListener playListener = new View.OnClickListener() {
        public void onClick(View v) {
            Log.d(logtag,"onClick() called - play button");
            Toast.makeText(FilePage.this, "The Play button was clicked.", Toast.LENGTH_LONG).show();
            Log.d(logtag,"onClick() ended - play button");
        }
    };


}