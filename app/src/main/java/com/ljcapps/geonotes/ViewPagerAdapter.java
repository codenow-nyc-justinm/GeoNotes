package com.ljcapps.geonotes;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {

    CharSequence tabTitles[];
    int tabCount;

    public ViewPagerAdapter(FragmentManager fm,CharSequence mTitles[], int mNumbOfTabsumb) {
        super(fm);

        this.tabTitles = mTitles;
        this.tabCount = mNumbOfTabsumb;
    }

    @Override
    public Fragment getItem(int position) {
        if(position == 0)
        {
            Tab1 tab1 = new Tab1();
            return tab1;
        }
        else
        {
            Tab2 tab2 = new Tab2();
            return tab2;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0 || position == 1) {
            return tabTitles[position];
        }
        return tabTitles[1];
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}