package com.qrusial.wallet.view.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.IncomeHistory;
import com.qrusial.wallet.model.entity.ExpenseHistory;

import java.util.ArrayList;

/**
 * Created by Agus Manto on 20/05/2017.
 */

public class Tab2Expense extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2expense);
        init();
        event();
    }

    Button btnAddExpense;
    EditText expenseValue;
    Spinner spinnerExpense;
    public void init(){
        btnAddExpense = (Button) findViewById(R.id.submitExpense);
        expenseValue = (EditText) findViewById(R.id.expenseValue);
        spinnerExpense = (Spinner) findViewById(R.id.spinnerExpense);
    }

    public void event(){
        //Untuk tidak memunculkan angka 0 pada ketikan pertama
        expenseValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String inputEt_income = s.toString();
                if (inputEt_income.startsWith("0")) {
//                    Toast.makeText(getBaseContext(),"Gak bisa pencet Nol",Toast.LENGTH_SHORT).show();
                    if (inputEt_income.length() > 0) {
                        expenseValue.setText(inputEt_income.substring(1));
                    } else {
                        expenseValue.setText("");
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        btnAddExpense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getItem = spinnerExpense.getSelectedItem().toString();
                String getInput = expenseValue.getText().toString();

                if(getInput==null||getInput.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Please enter the value", Toast.LENGTH_LONG).show();
                }
                else{
                    ExpenseHistory.arrayRecordExpense.add(getItem + " = IDR. " + getInput);
                    Toast.makeText(getBaseContext(),"Submitted!!!", Toast.LENGTH_LONG).show();
                    ((EditText)findViewById(R.id.expenseValue)).setText("");
                }
            }
        });
    }
}
