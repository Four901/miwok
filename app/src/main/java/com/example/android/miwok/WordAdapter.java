package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.provider.UserDictionary;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.io.LineNumberReader;
import java.util.ArrayList;
import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> objects) {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        //WordAdapter curwordAdapter=(WordAdapter)getItem(position);
       View listItemView=convertView;
       if(listItemView==null)
       {
           listItemView = LayoutInflater.from(getContext()).inflate(
                   R.layout.list_item, parent, false);
       }

       TextView txt1=(TextView)listItemView.findViewById(R.id.txt1);
       TextView txt2=(TextView)listItemView.findViewById(R.id.txt2);
       ImageView img=(ImageView)listItemView.findViewById(R.id.img);
       txt1.setText(getItem(position).getMiwo_str());
        txt2.setText(getItem(position).getEng_str());
        img.setImageResource(getItem(position).getImage_res());
        return listItemView;
    }


}
