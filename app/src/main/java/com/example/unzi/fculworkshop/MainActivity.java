package com.example.unzi.fculworkshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myButton;
    Button mySendButton;
    Button myLoadButton;

    TextView myTextView;
    EditText myEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*TextView tv = new TextView(this);
        tv.setText("My Hello World!");
        setContentView(tv);*/

        myButton =(Button) findViewById(R.id.change_text);
        myTextView = (TextView) findViewById(R.id.textView);
        myEditText = (EditText) findViewById( R.id.editText);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTextView.setText(myEditText.getText());
            }
        });


        mySendButton =(Button) findViewById(R.id.send_button);
        mySendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                i.putExtra("newText",myEditText.getText().toString());
                startActivity(i);
            }
        });

        myLoadButton =(Button) findViewById(R.id.load_button);
        myLoadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(i);
            }
        });
    }
}
