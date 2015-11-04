package com.marrache.nathan.uitut;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Nathan on 2015-11-04.
 */
public class SelectionPage extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button efct_btn = (Button) findViewById(R.id.effects_button);
        efct_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent efct_intent = new Intent(SelectionPage.this, InfoPage.class);
                startActivity(efct_intent);
            }
        });

        Button file_btn = (Button) findViewById(R.id.files_button);
        file_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent file_intent = new Intent(SelectionPage.this, FilePage.class);
                startActivity(file_intent);
            }
        });
        }


}
