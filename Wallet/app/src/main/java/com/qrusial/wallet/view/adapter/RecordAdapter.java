package com.qrusial.wallet.view.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.qrusial.wallet.R;
import com.qrusial.wallet.view.fragment.ExpenseFragment;
import com.qrusial.wallet.view.fragment.IncomeFragment;

/**
 * Created by Agus Manto on 13/06/2017.
 */

public class RecordAdapter extends FragmentPagerAdapter {


    int tabCount;

    public RecordAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragment tab1 = new IncomeFragment();
                return tab1;
            case 1:
                Fragment tab2 = new ExpenseFragment();
                return tab2;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
