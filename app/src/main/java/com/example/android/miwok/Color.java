package com.example.android.miwok;

public class Color {
    private String color;
    private String hexa;
    private int image_res;
    public Color(String color,String hexa,int image_res)
    {
        this.color=color;
        this.hexa=hexa;
        this.image_res=image_res;
    }
    public String getColor()
    {
        return color;
    }
    public String getHexa()
    {
        return hexa;
    }
    public int getImage_res()
    {
        return image_res;
    }
}
