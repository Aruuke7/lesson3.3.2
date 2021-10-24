package com.example.lesson332;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RegionAdapter adapter;
    private ArrayList<Region> mRegions = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        createList();
        recyclerView = findViewById(R.id.detailRecyclerView);
        adapter = new RegionAdapter(this, mRegions);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<Region> createList() {
        int id = getIntent().getIntExtra(MainActivity.KEY, 1);
        if (1 == id){
            mRegions.add(new Region("Armenia", "Yerevan",R.drawable.ic_armenia));
            mRegions.add(new Region("Uzbekistan", "Tashkent",R.drawable.ic_uzb));
            mRegions.add(new Region("Kyrgyzstan", "Bishkek",R.drawable.ic_kg));
            mRegions.add(new Region("Albania", "Tirana",R.drawable.ic_alb));
            mRegions.add(new Region("Bangladesh", "Dhaka",R.drawable.ic_bang));
            mRegions.add(new Region("Belgium", "Brussels",R.drawable.ic_belg));
            mRegions.add(new Region("China", "Beijing",R.drawable.ic_chin));
            mRegions.add(new Region("Estonia", "Tallinn",R.drawable.ic_est));
            mRegions.add(new Region("France", "Paris",R.drawable.ic_fr));
            mRegions.add(new Region("Greece", "Athens",R.drawable.ic_greec));
        }else if (2 == id) {
            mRegions.add(new Region("Algeria", "Algiers", R.drawable.ic_alger));
            mRegions.add(new Region("Botswana", "Gaborone",R.drawable.ic_botsw));
            mRegions.add(new Region("Cameroon", "Yaounde",R.drawable.ic_camerun));
            mRegions.add(new Region("Chad", "N'Djamena",R.drawable.ic_chad));
            mRegions.add(new Region("Egypt", "Cairo",R.drawable.ic_egypt));
            mRegions.add(new Region("Kenya", "Nairobi",R.drawable.ic_kenya));
            mRegions.add(new Region("Liberia", "Monrovia",R.drawable.ic_lib));
            mRegions.add(new Region("Morocco", "Rabat",R.drawable.ic_mar));
            mRegions.add(new Region("Niger", "Niamey",R.drawable.ic_niger));
            mRegions.add(new Region("Sudan", "Khartoum",R.drawable.ic_sud));
        }else if (3 == id){
            mRegions.add(new Region("Australia", "Canberra",R.drawable.ic_austr));
            mRegions.add(new Region("Fiji", "Suva",R.drawable.ic_fiji));
            mRegions.add(new Region("Kiribati", "Tarawa",R.drawable.ic_kiri));
            mRegions.add(new Region("Nauru", "Yaren",R.drawable.ic_naur));
            mRegions.add(new Region("Palau", "Koror",R.drawable.ic_palau));
            mRegions.add(new Region("Samoa", "Apia",R.drawable.ic_samoa));
            mRegions.add(new Region("Tonga", "Nuku'alofa",R.drawable.ic_tong));
            mRegions.add(new Region("Tuvalu", "Funafuti",R.drawable.ic_tuval));
            mRegions.add(new Region("Vanuatu", "Port Vila",R.drawable.ic_vanu));
            mRegions.add(new Region("New Zealand", "Wellington",R.drawable.ic_nz));
        }else if (4 == id){
            mRegions.add(new Region("Adelie Land","",R.drawable.ic_antarct));
            mRegions.add(new Region("British Antarctic Territory","",R.drawable.ic_antarct));
            mRegions.add(new Region("Ross Dependency","",R.drawable.ic_antarct));
            mRegions.add(new Region("Peter I Island","",R.drawable.ic_antarct));
            mRegions.add(new Region("Queen Maud Land","",R.drawable.ic_antarct));
            mRegions.add(new Region("Australian Antarctic Territory","",R.drawable.ic_antarct));
            mRegions.add(new Region("Chilean Antarctic Territory","",R.drawable.ic_antarct));
            mRegions.add(new Region("Argentine Antarctic","",R.drawable.ic_antarct));
        }else if (5 ==id){
            mRegions.add(new Region("Canada", "Ottawa",R.drawable.ic_canad));
            mRegions.add(new Region("Costa Rica", "San Jose",R.drawable.ic_cr));
            mRegions.add(new Region("Cuba", "Havana",R.drawable.ic_cuba));
            mRegions.add(new Region("Haiti", "Port-au-Prince",R.drawable.ic_gait));
            mRegions.add(new Region("Jamaica", "Kingston",R.drawable.ic_jamai));
            mRegions.add(new Region("Mexico", "Mexico",R.drawable.ic_mex));
            mRegions.add(new Region("Nicaragua", "Managua",R.drawable.ic_nicara));
            mRegions.add(new Region("Dominica", "Roseau",R.drawable.ic_domi));
            mRegions.add(new Region("Belize", "Belmopan",R.drawable.ic_bz));
            mRegions.add(new Region("Aruba", "Oranjestad",R.drawable.ic_arub));
        }else if (6 == id){
            mRegions.add(new Region("Bolivia", "Sucre",R.drawable.ic_bol));
            mRegions.add(new Region("Brazil", "Brasilia",R.drawable.ic_braz));
            mRegions.add(new Region("Colombia", "Bogota",R.drawable.ic_colom));
            mRegions.add(new Region("Uruguay", "Montevideo",R.drawable.ic_urug));
            mRegions.add(new Region("Peru", "Lima",R.drawable.ic_peru));
            mRegions.add(new Region("Venezuela", "Caracas",R.drawable.ic_venes));
            mRegions.add(new Region("Ecuador", "Quito",R.drawable.ic_ecuad));
            mRegions.add(new Region("Argentina", "Buenos Aires",R.drawable.ic_arg));
            mRegions.add(new Region("Guyana", "Georgetown",R.drawable.ic_guyan));
            mRegions.add(new Region("Paraguay", "Asuncion",R.drawable.ic_parag));
        }
        return mRegions;
    }

}