package com.qrusial.wallet.view.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.IncomeHistory;
import com.qrusial.wallet.model.entity.User;
import com.qrusial.wallet.view.adapter.IncomeHistoryAdapter;

import java.util.ArrayList;

/**
 * Created by USER on 12/06/2017.
 */

public class IncomeFragment extends Fragment {
    private RecyclerView recyclerView;
    private IncomeHistoryAdapter adapter;
    private ArrayList<IncomeHistory> histories;

    public IncomeFragment(){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View _view = inflater.inflate(R.layout.fragment_income, container,false);

        histories = User.loggedInUser.getIncomeHistory();
        adapter = new IncomeHistoryAdapter();
        recyclerView = (RecyclerView) _view.findViewById(R.id.income_recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter.setIncomeHistories(histories);
        recyclerView.setAdapter(adapter);
        return _view;
    }
}
