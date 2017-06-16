package com.qrusial.wallet.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.IncomeHistory;

/**
 * Created by Agus Manto on 12/06/2017.
 */

public class IncomeFragment extends Fragment {

    ListView showIncome;

    public IncomeFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View _view = inflater.inflate(R.layout.fragment_income, container,false);
        showListIncome(_view);

        return _view;
    }

    public void showListIncome(View view){
        showIncome = (ListView) view.findViewById(R.id.incomeList);
        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, IncomeHistory.arrayRecordIncome);
        showIncome.setAdapter(adapter);
    }
}
