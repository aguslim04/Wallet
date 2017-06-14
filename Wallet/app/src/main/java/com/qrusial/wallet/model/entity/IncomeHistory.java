package com.qrusial.wallet.model.entity;

/**
 * Created by Agus Manto on 06/06/2017.
 */


public class IncomeHistory {

    private int incomeValue;
    private String incomeItem;

    public IncomeHistory(){ }

    public IncomeHistory(String incomeItem, int incomeValue){
        setIncomeItem(incomeItem);
        setIncomeValue(incomeValue);
    }


    public void setIncomeItem(String incomeItem){
        this.incomeItem = incomeItem;
    }

    public void setIncomeValue(int incomeValue){
        this.incomeValue = incomeValue;
    }

    public String getIncomeItem(){
        return incomeItem;
    }

    public int getIncomeValue(){
        return incomeValue;
    }

}
