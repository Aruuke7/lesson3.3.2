package com.example.lesson332;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    ArrayList<Region> regions = new ArrayList<>();
    RegionAdapter adapter;
    private OnRegionClickListener clickListener;
    public static final String KEY = "key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setData();
        mRecyclerView = findViewById(R.id.mainRecyclerView);
        clickListener = new OnRegionClickListener() {
            @Override
            public void onRegionClick(Region region, int position) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra(KEY, region.getId());
                startActivity(intent);
            }
        };
        adapter = new RegionAdapter(this, regions, clickListener);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        mRecyclerView.setAdapter(adapter);

    }

    public void setData() {
        regions.add(new Region(1,"Евразия", "", R.drawable.ic_eur));
        regions.add(new Region(2,"Африка", "", R.drawable.ic_afr));
        regions.add(new Region(3,"Австралия", "", R.drawable.ic_antarct));
        regions.add(new Region(4,"Антарктида", "", R.drawable.ic_austral_c));
        regions.add(new Region(5,"Северная Америка", "", R.drawable.ic_na));
        regions.add(new Region(6,"Южная Америка", "", R.drawable.ic_sa));
    }


}
