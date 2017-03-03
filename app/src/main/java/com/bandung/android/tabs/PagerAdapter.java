package com.bandung.android.tabs;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by anggy on 02/03/2017.
 */

public class PagerAdapter extends FragmentPagerAdapter {


    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){

            case 0 : return new FragmentGardu1();

            case 1 : return new FragmentGardu2();

            case 2 : return new FragmentGardu3();

            default: return null;

        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){

            case 0 : return "Gardu satu";

            case 1 : return "Gardu kedua";

            case 2 : return "Gardu ketiga";

            default: return null;

        }
    }
}
