package com.qrusial.wallet.model.entity;

/**
 * Created by Agus Manto on 21/03/2017.
 */

import java.util.ArrayList;

public class User {
    private int id;
    private String email;
    private String password;
    private int dompet;

    public static int _id = 1;
    public static User loggedInUser;

    public static ArrayList<User> users = new ArrayList<>();
    private ArrayList<IncomeHistory> incomeHistory = new ArrayList<>();

    public User() {}

    public User(String email, String password, int dompet) {
        this.email = email;
        this.password = password;
        this.dompet = dompet;
        this.id = _id;
        _id++;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDompet(int dompet){
        this.dompet = dompet;
    }

    public int getDompet(){
        return dompet;
    }

    public ArrayList<IncomeHistory> getIncomeHistory(){
        return incomeHistory;
    }

    public void setIncomeHistory(ArrayList<IncomeHistory> incomeHistory){
        this.incomeHistory = incomeHistory;
    }



    public void tambahIncomeHistory(IncomeHistory history){
        this.incomeHistory.add(history);
    }
}
