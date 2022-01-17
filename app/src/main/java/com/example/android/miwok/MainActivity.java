package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button) findViewById(R.id.numbers);


       // btn.setOnClickListener(new NumbersClickListener(){


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent numIntent = new Intent(MainActivity.this, Numbers.class);
                startActivity(numIntent);
            }
        });


        Button btn1=(Button) findViewById(R.id.colors);


        // btn.setOnClickListener(new NumbersClickListener(){


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent colintent = new Intent(MainActivity.this,Colors.class);
                startActivity(colintent);
            }
        });


        Button btn2=(Button) findViewById(R.id.family_members);


        // btn.setOnClickListener(new NumbersClickListener(){


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fmintent = new Intent(MainActivity.this,FamilyMembers.class);
                startActivity(fmintent);
            }
    });


        Button btn3=(Button) findViewById(R.id.phrases);


        // btn.setOnClickListener(new NumbersClickListener(){


        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent phrasesintent = new Intent(MainActivity.this,Phrases.class);
                startActivity(phrasesintent);
            }
        });

    }
//    public void Numbers_checkout(View view)
//    {
//        Intent numintent = new Intent(this,Numbers.class);
//        startActivity(numintent);
//    }
//    public void Colors_checkout(View view)
//    {
//        Intent colintent = new Intent(this,Colors.class);
//        startActivity(colintent);
//    }
//    public void FamilyMembers_checkout(View view)
//    {
//        Intent fmintent = new Intent(this,FamilyMembers.class);
//        startActivity(fmintent);
//    }
//    public void Phrases_checkout(View view)
//    {
//        Intent phrasesintent = new Intent(this,Phrases.class);
//        startActivity(phrasesintent);
//    }
}