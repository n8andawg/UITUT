package com.marrache.nathan.uitut;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class InfoPage extends AppCompatActivity {

    String selected_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_page);
        final TextView info_text = (TextView) findViewById(R.id.effect_info_text);
        info_text.setText(R.string.gain_info_text);

        final Button gainBtn = (Button) findViewById(R.id.gain_button);
        final Button speedBtn = (Button) findViewById(R.id.speed_button);
        final Button mixingBtn = (Button) findViewById(R.id.mixing_button);

        final Button use_button = (Button)findViewById(R.id.use_button);

        gainBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_text.setText(R.string.gain_info_text);
                gainBtn.setBackgroundColor(0xff99cc00);

                speedBtn.setBackgroundResource(android.R.drawable.btn_default);
                mixingBtn.setBackgroundResource(android.R.drawable.btn_default);

                selected_button = "gain";
                use_button.setText(R.string.use_gain_button_text);
            }
        });

        speedBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_text.setText(R.string.speed_info_text);
                speedBtn.setBackgroundColor(0xff99cc00);

                gainBtn.setBackgroundResource(android.R.drawable.btn_default);
                mixingBtn.setBackgroundResource(android.R.drawable.btn_default);

                selected_button = "speed";
                use_button.setText(R.string.use_speed_button_text);
            }
        });

        mixingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                info_text.setText(R.string.mixing_info_text);
                mixingBtn.setBackgroundColor(0xff99cc00);

                gainBtn.setBackgroundResource(android.R.drawable.btn_default);
                speedBtn.setBackgroundResource(android.R.drawable.btn_default);

                selected_button = "mixing";
                use_button.setText(R.string.use_mixing_button_text);
            }
        });

        use_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            //Select page to go to based on info page selected
            switch (selected_button) {
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
    }
        );

        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
    }

}
