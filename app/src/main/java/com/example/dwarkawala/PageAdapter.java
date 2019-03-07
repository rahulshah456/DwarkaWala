package com.example.dwarkawala;

import android.content.Context;
import android.support.design.widget.TabItem;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.LayoutInflater;


public class PageAdapter extends FragmentPagerAdapter {

    private int numOfTabs;



    public PageAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                return new feedsfragment();
            case 1:
                return new dealsfragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return numOfTabs;

    }

}
