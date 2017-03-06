package com.example.unzi.fculworkshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView myTextView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        myTextView2 = (TextView) findViewById(R.id.textView2);

        Bundle extras = getIntent().getExtras();
        String newText = extras.getString("newText");

        if(newText!=null){
            myTextView2.setText(newText);
        }
    }
}
