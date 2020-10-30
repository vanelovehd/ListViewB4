package com.example.day04_bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvGiaoDich;
    GiaoDich gd1, gd2, gd3, gd4, gd5, gd6, gd7, gd8, gd9, gd10;
    List lstGD;
    AdapterGiaoDich adapterGiaoDich;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGiaoDich=findViewById(R.id.lvGiaoDich);
        lstGD=new ArrayList<>();
        gd1=new GiaoDich("14/11/2018", "VFMVFB", "600.000.123", "600.000.123", "0.0%");
        gd2=new GiaoDich("18/10/2018", "VFMVF1", "45.169.614", "44.699.147", "-1.04%");
        gd3=new GiaoDich("05/11/2018", "VFMVF1", "19.999.951", "21.065.916", "5.33%");
        gd4=new GiaoDich("06/11/2018", "VFMVF1", "10.000.163", "10.533.165", "5.33%");
        gd5=new GiaoDich("07/11/2018", "VFMVF1", "14.999.945", "14.999.945", "0.0%");
        gd6=new GiaoDich("08/11/2018", "VFMVF1", "25.000.172", "25.000.172", "0.0%");
        gd7=new GiaoDich("09/11/2018", "VFMVF4", "505.752.431", "1.122.166.457", "120.8%");
        gd8=new GiaoDich("","","","","");
        gd9=new GiaoDich("","","","","");
        gd10=new GiaoDich("","","","","");

        lstGD.add(gd1);
        lstGD.add(gd2);
        lstGD.add(gd3);
        lstGD.add(gd4);
        lstGD.add(gd5);
        lstGD.add(gd6);
        lstGD.add(gd7);
        lstGD.add(gd8);
        lstGD.add(gd9);
        lstGD.add(gd10);

        adapterGiaoDich=new AdapterGiaoDich(lstGD);
        lvGiaoDich.setAdapter(adapterGiaoDich);
    }
}