package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.nio.channels.AcceptPendingException;
import java.util.ArrayList;
import java.util.List;

public class PhraseAdapter extends ArrayAdapter<Phrase> {

    public PhraseAdapter(Activity context,ArrayList<Phrase> objects) {
        super(context, 0, objects);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView=convertView;
        if(listItemView==null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        TextView txt1=(TextView)listItemView.findViewById(R.id.txt1);
        TextView txt2=(TextView)listItemView.findViewById(R.id.txt2);
        ImageView img=(ImageView)listItemView.findViewById(R.id.img);
        txt1.setText(getItem(position).getPhrase());
        txt2.setText(getItem(position).getEng_phrase());
        img.setImageResource(getItem(position).getImage_res());
        return listItemView;
    }
}
