package com.qrusial.wallet.view.menu;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.qrusial.wallet.R;

import java.util.ArrayList;

/**
 * Created by Agus Manto on 20/5/2017.
 */

public class Tab2Expense extends AppCompatActivity {

    Button button;
    EditText editText;
    Spinner spinner;
    ListView listView;
    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab2expense);

        editText = (EditText) findViewById(R.id.expenseValue);
        spinner = (Spinner) findViewById(R.id.spinnerExpense);
        listView = (ListView)findViewById(R.id.expenseList);
        button = (Button) findViewById(R.id.submitExpense);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getItem = spinner.getSelectedItem().toString();
                String getInput = editText.getText().toString();

                if(getInput==null||getInput.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Value is required !!!", Toast.LENGTH_LONG).show();
                }
                else{
                    arrayList.add(getItem + " = IDR. " +getInput);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(Tab2Expense.this, android.R.layout.simple_list_item_1, arrayList);
                    Toast.makeText(getBaseContext(),"Submitted!!!", Toast.LENGTH_LONG).show();
                    listView.setAdapter(adapter);
                    ((EditText)findViewById(R.id.expenseValue)).setText("");
                }
            }
        });

    }
}
