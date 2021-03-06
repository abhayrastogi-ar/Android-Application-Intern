package com.example.task9recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=(RecyclerView) findViewById(R.id.recycler);
        int images[] = {R.drawable.alpha,R.drawable.beta,R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,R.drawable.froyo,R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.icecreamsandwich,R.drawable.jellybean,R.drawable.kitkat,R.drawable.lollipop,R.drawable.marshmallow,R.drawable.nougat,R.drawable.oreo,R.drawable.pie,R.drawable.q,R.drawable.r};

        String codename[] = {"Alpha","Beta","Cupcake","Donut","Eclair","Froyo","GingerBread","Honeycomb","Icecreamsandwich","Jellybean","Kitkat","Lollipop","Marshmallow","Noughat","Oreo","Pie","Q","R"};

        String versionNumber[] = {"1.0","1.1","1.5","1.6","2.0-2.1","2.2.x","2.3-2.3.7","3.0-3.2.x","4.0.1-4.0.4","4.1.x-4.3.x","4.4-4.4.4","5.0-5.1","6.0","7.0-7.1","8.0.0-8.1.0","9","10","11"};

        String apiLevels[] ={"API Level 1","API Level 2","API Level 3","API Level 5-7","API Level 8","API Level 9-10","API Level 11-13","API Level 14-15","API Level 16-18","API Level 19","API Level 21-22","API Level 23","API Level 24-25","API Level 1","API Level 26-27","API Level 28","API Level 29","API Level 30",};

        String releaseDate[] ={"September 23, 2008","February 9, 2009","April 27, 2009","September 15, 2009","October 26, 2009","May 20, 2010","December 6, 2010","February 22, 2011","October 18, 2011","July 9, 2012","October 31, 2013","November 12, 2014","October 5, 2015","August 22, 2016","August 21, 2017","August 6, 2018","September 3, 2019","[to be determined]"};

        rv.setLayoutManager(new LinearLayoutManager((this)));
        MyAdapter adapter=new MyAdapter(this,images,codename,versionNumber,apiLevels,releaseDate);
        rv.setAdapter(adapter);

    }
}