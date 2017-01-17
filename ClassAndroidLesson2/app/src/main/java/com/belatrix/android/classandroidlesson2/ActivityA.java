package com.belatrix.android.classandroidlesson2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

public class ActivityA extends AppCompatActivity {

    private int[] images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        initViews();
    }

    private void initViews(){
        final RecyclerView recyclerGallery = (RecyclerView)findViewById(R.id.recyclerGallery);
        recyclerGallery.setHasFixedSize(true);
        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerGallery.setLayoutManager(layoutManager);

        images= new int[]{
                R.drawable.sample_0,
                R.drawable.sample_1,
                R.drawable.sample_2,
                R.drawable.sample_3,
                R.drawable.sample_4,
                R.drawable.sample_5,
                R.drawable.sample_6,
                R.drawable.sample_7};

        RecyclerAdapter adapter = new RecyclerAdapter(getApplicationContext(), images);
        recyclerGallery.setAdapter(adapter);

        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), ActivityB.class));
            }
        });
    }
}
