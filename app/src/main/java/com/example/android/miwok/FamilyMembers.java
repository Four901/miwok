package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyMembers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family_members);
        ArrayList<Person> persons=new ArrayList<Person>();
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        persons.add(new Person("xyz","xyz",R.drawable.person));
        PersonAdapter prnsonAdapter=new PersonAdapter(this,persons);
        ListView lstView=(ListView) findViewById(R.id.root_id);
        lstView.setAdapter(prnsonAdapter);
    }
}