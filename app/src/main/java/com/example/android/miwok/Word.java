package com.example.android.miwok;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

class Word implements Adapter {
    private String miwo_str;
    private String Eng_str;
    private int image_res;
    private int audio_res;
    public Word(String miwo_str,String Eng_str,int image_res)
    {
        this.miwo_str=miwo_str;
        this.Eng_str=Eng_str;
        this.image_res=image_res;
    }
    public Word(String miwo_str,String Eng_str,int image_res,int audio_res)
    {
        this.miwo_str=miwo_str;
        this.Eng_str=Eng_str;
        this.image_res=image_res;
        this.audio_res=audio_res;
    }
    public String getMiwo_str()
    {
        return this.miwo_str;
    }
    public String getEng_str()
    {
        return this.Eng_str;
    }
    public int getImage_res()
    {
        return image_res;
    }
    public int getAudio_res(){return audio_res;}

    @Override
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {

    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }

    @Override
    public int getItemViewType(int i) {
        return 0;
    }

    @Override
    public int getViewTypeCount() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
