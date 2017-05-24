package com.qrusial.wallet.view.menu;

/**
 * Created by Agus Manto on 21/03/2017.
 */

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.qrusial.wallet.R;

public class AddRecord extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_record);

        Button Income = (Button) findViewById(R.id.income);
        Button Expense = (Button) findViewById(R.id.expense);

        Income.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent income = new Intent(AddRecord.this, Tab1Income.class);
                startActivity(income);
            }
        });

        Expense.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent expense = new Intent(AddRecord.this, Tab2Expense.class);
                startActivity(expense);
            }
        });
    }
}
