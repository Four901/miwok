package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrases);
        ArrayList<Phrase> phrases=new ArrayList<Phrase>();
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        phrases.add(new Phrase("xyz","xyz",R.drawable.phrases));
        PhraseAdapter phrAdapter=new PhraseAdapter(this,phrases);
        ListView lstView=(ListView) findViewById(R.id.root_id);
        lstView.setAdapter(phrAdapter);
    }
}