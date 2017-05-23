package com.qrusial.wallet.view.menu;

/**
 * Created by Agus Manto on 10/04/2017.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qrusial.wallet.R;

public class Tab1Income extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1income, container, false);
        return rootView;
    }
}
