package com.qrusial.wallet.view.menu;

/**
 * Created by Ferik Enedy Wijayaon 1/06/2017.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import com.qrusial.wallet.R;

import java.util.ArrayList;

public class Tab1Income extends AppCompatActivity {
    Button bt;
    EditText et;
    Spinner si;
    ListView show;
    ArrayList<String> addArray = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab1income);

        et = (EditText) findViewById(R.id.incomeValue);
        si = (Spinner) findViewById(R.id.spinnerIncome);
        show = (ListView)findViewById(R.id.incomeList);
        bt = (Button) findViewById(R.id.submitIncome);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getItem = si.getSelectedItem().toString();
                String getInput = et.getText().toString();

                if(getInput==null||getInput.trim().equals("")){
                    Toast.makeText(getBaseContext(),"Value is required !!!", Toast.LENGTH_LONG).show();
                }
                else{
                    addArray.add(getItem + " = IDR. " + getInput);
                    ArrayAdapter<String> adapter = new ArrayAdapter<String>(Tab1Income.this, android.R.layout.simple_list_item_1, addArray);
                    Toast.makeText(getBaseContext(),"Submitted!!!", Toast.LENGTH_LONG).show();
                    show.setAdapter(adapter);
                    ((EditText)findViewById(R.id.incomeValue)).setText("");
                }
            }
        });


    }
}
