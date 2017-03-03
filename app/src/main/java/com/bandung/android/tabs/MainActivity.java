package com.bandung.android.tabs;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Deklarasi ViewPager sesuaikan id yang ada pada XML MainActivity
        ViewPager vp = (ViewPager)findViewById(R.id.viewPager);

        //Deklarasi PagerAdapter sesuaikan dengan class yang sudah di buat
        PagerAdapter pts = new PagerAdapter(getSupportFragmentManager());

        //Menetapkan adapter dari si ViewPager
        vp.setAdapter(pts);

        //Layout untuk Tab
        TabLayout tl = (TabLayout)findViewById(R.id.tabbabLayout);

        //Menetapkan Layout kepada ViewPager
        tl.setupWithViewPager(vp);

    }
}
