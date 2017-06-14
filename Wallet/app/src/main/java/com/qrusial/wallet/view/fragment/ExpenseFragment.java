package com.qrusial.wallet.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qrusial.wallet.R;

/**
 * Created by USER on 13/06/2017.
 */

public class ExpenseFragment extends Fragment {

    public ExpenseFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View _view = inflater.inflate(R.layout.fragment_expense, container,false);

        return _view;
    }
}
