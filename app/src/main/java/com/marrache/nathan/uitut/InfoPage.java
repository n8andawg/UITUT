package com.marrache.nathan.uitut;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class InfoPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_page);
    final String selected_button = "gain";//FIXME this string needs to change on button click
        Button use_button = (Button)findViewById(R.id.use_button);
        use_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Select page to go to based on info page selected
                switch (selected_button){
                    case "mixing":
                        Intent mixing_intent = new Intent(InfoPage.this, MixingPage.class);
                        startActivity(mixing_intent);
                        break;
                    case "gain":
                        Intent gain_intent = new Intent(InfoPage.this, GainPage.class);
                        startActivity(gain_intent);
                        break;
                    case "speed":
                        Intent speed_intent = new Intent(InfoPage.this, SpeedPage.class);
                        startActivity(speed_intent);
                        break;
                    default:
                        Toast.makeText(InfoPage.this, "Use button failed.", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });



    }

}
