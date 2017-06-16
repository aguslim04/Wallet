package com.qrusial.wallet.view.menu;

/**
 * Created by Ferik Enedy on 1/06/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.IncomeHistory;
import java.util.Calendar;


public class Tab1Income extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1income);
        init();
        event();
    }

    Button btnAddIncome;
    EditText incomeValue;
    Spinner spinnerIncome;
    public void init(){
        btnAddIncome = (Button) findViewById(R.id.submitIncome);
        incomeValue = (EditText) findViewById(R.id.incomeValue);
        spinnerIncome = (Spinner) findViewById(R.id.spinnerIncome);
    }

    public void event(){
        Calendar c = Calendar.getInstance();
        final int seconds = c.get(Calendar.SECOND);
        //Untuk tidak memunculkan angka 0 pada ketikan pertama
        incomeValue.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                String inputEt_income = s.toString();
                if (inputEt_income.startsWith("0")) {
//                    Toast.makeText(getBaseContext(),"Gak bisa input 0",Toast.LENGTH_SHORT).show();
                    if (inputEt_income.length() > 0) {
                        incomeValue.setText(inputEt_income.substring(1));
                    } else {
                        incomeValue.setText("");
                    }
                }
            }
            @Override
            public void afterTextChanged(Editable s) {}
        });
        btnAddIncome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getItem = spinnerIncome.getSelectedItem().toString();
                String getInput = incomeValue.getText().toString();

                if(getInput==null||getInput.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Please enter the value", Toast.LENGTH_LONG).show();
                }
                else{
                    IncomeHistory.arrayRecordIncome.add(getItem + " = IDR. " + getInput );
                    Toast.makeText(getBaseContext(),"Submitted!!!", Toast.LENGTH_LONG).show();
                    ((EditText)findViewById(R.id.incomeValue)).setText("");
                }
            }
        });
    }
}