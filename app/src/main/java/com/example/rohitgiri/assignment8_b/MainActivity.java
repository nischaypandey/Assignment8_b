package com.example.rohitgiri.assignment8_b;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
//creating a class which is extending AppCompatActivity
public class MainActivity extends AppCompatActivity {

    private ListView mlistview;                  //creating object of list view
    private ArrayList<Itemdetails> mlistdata;     //creating object of arraylist
    private CustomAdapter mcustomAdapter;        //creating object of custom Adapter


    //onCreate Method
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     //setting Content View of UI

        mlistview=(ListView)findViewById(R.id.text); //assigning list view by it's ID
        mlistdata=new ArrayList<>();
        addDatatolist();                             //method for adding data to arraylist
        mcustomAdapter=new CustomAdapter(MainActivity.this,mlistdata);  //Custom Adapter to connect arrayList and ListView
        mlistview.setAdapter(mcustomAdapter);                         //setting Adapter
    }
    //addDatatolist method for adding data
    private void addDatatolist() {
        for(int i=0;i<10;i++)
        {
            Itemdetails itemdetails=new Itemdetails();         //Adding items to list
            itemdetails.setName("Friend"+i);
            itemdetails.setPhone("123456789"+i);
            mlistdata.add(itemdetails);
        }
    }
}
