package com.qrusial.wallet.view.menu;

/**
 * Created by Agus Manto on 21/03/2017.
 */


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.qrusial.wallet.R;

public class Record extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_record);

        Button Income = (Button) findViewById(R.id.recordIncome);
        Button Expense = (Button) findViewById(R.id.recordExpense);

        Income.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent income = new Intent(Record.this, RecordIncome.class);
                startActivity(income);
            }
        });

        Expense.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent expense = new Intent(Record.this, RecordExpense.class);
                startActivity(expense);
            }
        });

    }
}
