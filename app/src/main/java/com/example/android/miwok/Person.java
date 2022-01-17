package com.example.android.miwok;

public class Person
{
    private String relation;
    private String engRelation;
    private int image_res;
    public Person(String relation,String engRelation,int image_res)
    {
        this.relation=relation;
        this.engRelation=engRelation;
        this.image_res=image_res;
    }
    public String getRelation()
    {
        return relation;
    }
    public String getEngRelation()
    {
        return engRelation;

    }
    public int getImage_res()
    {
        return image_res;
    }
}
