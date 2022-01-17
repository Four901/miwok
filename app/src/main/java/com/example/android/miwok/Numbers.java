package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Numbers extends AppCompatActivity {
    public void relaseMediaPlayer(MediaPlayer temp)
    {
        if(temp!=null)
        {
            temp.release();
            temp=null;
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("zero","0",R.drawable.donut));
        words.add(new Word("one","1",R.drawable.donut));
        words.add(new Word("two","2",R.drawable.donut));
        words.add(new Word("three","3",R.drawable.donut));
        words.add(new Word("four","4",R.drawable.donut));
        words.add(new Word("five","5",R.drawable.donut));
        words.add(new Word("six","6",R.drawable.donut));
        words.add(new Word("seven","7",R.drawable.donut));
        words.add(new Word("eight","8",R.drawable.donut));
        words.add(new Word("nine","9",R.drawable.donut));
        words.add(new Word("ten","10",R.drawable.donut));
        words.add(new Word("zero","0",R.drawable.donut));
        words.add(new Word("one","1",R.drawable.donut));
        words.add(new Word("two","2",R.drawable.donut));
        words.add(new Word("three","3",R.drawable.donut));
        words.add(new Word("four","4",R.drawable.donut));
        words.add(new Word("five","5",R.drawable.donut));
        words.add(new Word("six","6",R.drawable.donut));
        words.add(new Word("seven","7",R.drawable.donut));
        words.add(new Word("eight","8",R.drawable.donut));
        words.add(new Word("nine","9",R.drawable.donut));
        words.add(new Word("ten","10",R.drawable.donut));


        WordAdapter itemsAdapter = new WordAdapter(this,words);
        ListView listView = (ListView) findViewById(R.id.root_id);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?>parent,View view,int position,long id)
            {

                MediaPlayer  mMediaPlayer=MediaPlayer.create(Numbers.this,R.raw.abc1+position);

                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(Numbers.this,"I'm Done",Toast.LENGTH_SHORT).show();
                        relaseMediaPlayer(mMediaPlayer);
                    }
                });

            }



        });


//        LinearLayout rootview=(LinearLayout) findViewById(R.id.root_id);
//        LinearLayout rootview1=new LinearLayout(this);
//        LinearLayout rootview2=new LinearLayout(this);
//        rootview1.setLeft(1);
//        rootview2.setRight(1);
//
//        rootview1.setOrientation(1);
//        rootview2.setOrientation(1);
//        rootview1.setTextAlignment(1);
//        rootview2.setTextAlignment(1);
//        for(int i=0;i<words.size();i++)
//        {
//            TextView txt=new TextView(this);
//            txt.setText(words.get(i));
//            txt.setHeight(350);
//            txt.setWidth(200);
//
//            txt.setTextSize(20);
//
//            rootview1.addView(txt);
//        }
//        for(int i=0;i<words.size();i++)
//        {
//            TextView txt=new TextView(this);
//            String str=Integer.toString(i);
//            txt.setText(str);
//            txt.setHeight(350);
//            txt.setWidth(200);
//
//            txt.setTextSize(20);
//
//            rootview2.addView(txt);
//        }
//     rootview.addView(rootview1);
//     rootview.addView(rootview2);
//        String[] words=new String[10];
//        words[0]="zero";
//        words[1]="ones";
//        words[2]="two";
//        words[3]="three";
//        words[4]="four";
//        words[5]="five";
//        words[6]="six";
//        words[7]="seven";
//        words[8]="eight";
//        words[9]="nine";
//        Log.v("Numbers","there are total "+words[0]);
    }
}