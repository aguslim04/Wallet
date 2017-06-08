package com.qrusial.wallet.view.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.qrusial.wallet.R;

/**
 * Created by Agus Manto on 10/04/2017.
 */

public class Tab2Expense extends AppCompatActivity {

    String var_expense, spinner_expense;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2expense);

        final EditText expenseText = (EditText) findViewById(R.id.expenseValue);
        final Spinner expenseSpinner = (Spinner) findViewById(R.id.spinnerExpense);
        Button expenseButton = (Button) findViewById(R.id.submitExpense);

        expenseButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                var_expense = expenseText.getText().toString();
                spinner_expense = expenseSpinner.getSelectedItem().toString();
                Intent i = null;
                i = new Intent(Tab2Expense.this, RecordIncome.class);

                Bundle b = new Bundle();
                b.putString("parse_value", var_expense);
                b.putString("parse_item", spinner_expense);
                i.putExtras(b);
                startActivity(i);
                Toast.makeText(Tab2Expense.this, "Submitted!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
