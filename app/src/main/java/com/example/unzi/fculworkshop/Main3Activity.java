package com.example.unzi.fculworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class Main3Activity extends AppCompatActivity {

    ImageView myBackground;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        myBackground = (ImageView) findViewById(R.id.background_random);
        Picasso.with(this).load("http://lorempixel.com/800/1280").into(myBackground);
    }
}
