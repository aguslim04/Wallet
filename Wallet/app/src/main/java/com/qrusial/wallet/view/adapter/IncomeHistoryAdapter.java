package com.qrusial.wallet.view.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.IncomeHistory;

import java.util.ArrayList;

/**
 * Created by Agus Manto on 06/06/2017.
 */

public class IncomeHistoryAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<IncomeHistory> incomeHistories;

    public ArrayList<IncomeHistory> getIncomeHistories(){
        return incomeHistories;
    }

    public void setIncomeHistories(ArrayList<IncomeHistory> incomeHistories){
        this.incomeHistories = incomeHistories;
    }

    public IncomeHistoryAdapter(){
        this.incomeHistories = new ArrayList<>();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_income, parent,false);
        return new incomeHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final incomeHistoryViewHolder _holder = (incomeHistoryViewHolder) holder;
        final IncomeHistory _incomeHistory = this.incomeHistories.get(position);
        _holder.item.setText(_incomeHistory.getIncomeItem());
        _holder.value.setText(_incomeHistory.getIncomeValue());
    }

    @Override
    public int getItemCount() {
        return incomeHistories.size();
    }

    private class incomeHistoryViewHolder extends RecyclerView.ViewHolder {
        private TextView item, value;
        public incomeHistoryViewHolder(View itemView) {
            super(itemView);
            item = (TextView)itemView.findViewById(R.id.item_income);
            value = (TextView)itemView.findViewById(R.id.value_income);
        }
    }

    public void swap(ArrayList incomeList){
        incomeHistories = incomeList;
    }
}
