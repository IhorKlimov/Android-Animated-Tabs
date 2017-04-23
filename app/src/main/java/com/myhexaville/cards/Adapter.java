package com.myhexaville.cards;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class Adapter extends FragmentStatePagerAdapter {
    public Adapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new BlankFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

}
