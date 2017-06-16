package com.qrusial.wallet.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.ExpenseHistory;

/**
 * Created by USER on 13/06/2017.
 */

public class ExpenseFragment extends Fragment {

    ListView showExpense;

    public ExpenseFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View _view = inflater.inflate(R.layout.fragment_expense, container,false);
        showListExpense(_view);

        return _view;
    }

    public void showListExpense(View view){
        showExpense = (ListView) view.findViewById(R.id.expenseList);
        ArrayAdapter<String> adapter = new  ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, ExpenseHistory.arrayRecordExpense);
        showExpense.setAdapter(adapter);
    }
}
