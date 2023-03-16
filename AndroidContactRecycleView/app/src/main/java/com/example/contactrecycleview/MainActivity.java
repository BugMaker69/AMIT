package com.example.contactrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList aryImg=new ArrayList<>(Arrays.asList(
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    ));
    ArrayList aryName=new ArrayList<>(Arrays.asList(
            "Omar","Ali","Amr","Mohammed"
    ));
    ArrayList aryNum=new ArrayList<>(Arrays.asList(
            "011","012","010","015"
    ));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        Adapter adapter = new Adapter( aryImg, aryName,aryNum,MainActivity.this);

        recyclerView.setAdapter(adapter);

    }
}