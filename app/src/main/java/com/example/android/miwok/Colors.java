package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.TypedArrayUtils;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.security.cert.CertificateParsingException;
import java.util.ArrayList;

public class Colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_colors);
        ArrayList<Color>colors=new ArrayList<Color>();
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        colors.add(new Color("red","#ffff",R.drawable.donut));
        ColorAdapter clrAdapter=new ColorAdapter(this,colors);
        ListView lrnLayout=(ListView) findViewById(R.id.root_id);
        lrnLayout.setAdapter(clrAdapter);
    }
}