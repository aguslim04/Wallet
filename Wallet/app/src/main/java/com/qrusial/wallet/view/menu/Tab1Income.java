package com.qrusial.wallet.view.menu;

/**
 * Created by Agus Manto on 10/04/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.qrusial.wallet.R;

public class Tab1Income extends AppCompatActivity {

    String var_income, spinner_income;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1income);

        final EditText incomeText = (EditText) findViewById(R.id.incomeValue);
        final Spinner incomeSpinner = (Spinner) findViewById(R.id.spinnerIncome);
        Button incomeButton = (Button) findViewById(R.id.submitIncome);

        incomeButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                var_income = incomeText.getText().toString();
                spinner_income = incomeSpinner.getSelectedItem().toString();
                Intent i = null;
                i = new Intent(Tab1Income.this, RecordIncome.class);

                Bundle b = new Bundle();
                b.putString("parse_value", var_income);
                b.putString("parse_item", spinner_income);
                i.putExtras(b);
                startActivity(i);

                Toast.makeText(Tab1Income.this, "Submitted!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
