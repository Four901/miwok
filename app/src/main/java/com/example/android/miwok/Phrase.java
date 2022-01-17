package com.example.android.miwok;

public class Phrase {
    private String phrase;
    private String eng_phrase;
    private int image_res;
    public Phrase(String phrase,String eng_phrase,int image_res)
    {
        this.phrase=phrase;
        this.eng_phrase=eng_phrase;
        this.image_res=image_res;
    }
    public String getPhrase()
    {
        return phrase;
    }
    public String getEng_phrase()
    {
        return eng_phrase;
    }
    public int getImage_res()
    {
        return image_res;
    }
}
