package org.mehreen.alphabetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start = (Button) findViewById(R.id.startbutton);
        start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent Alphabet= new Intent (MainActivity.this,Alphabets.class);
                startActivity(Alphabet);
            }
        });


    }
}