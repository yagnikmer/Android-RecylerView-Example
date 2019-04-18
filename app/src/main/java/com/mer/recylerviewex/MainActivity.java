package com.mer.recylerviewex;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create list
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 1; i <= 50; i++) {
            list.add("Item : " + i);
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        MyRecylerAdapter adapter = new MyRecylerAdapter(list);
        recyclerView.setAdapter(adapter);
    }
}
