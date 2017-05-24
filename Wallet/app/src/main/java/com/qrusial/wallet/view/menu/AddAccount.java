package com.qrusial.wallet.view.menu;

/**
 * Created by Agus Manto on 21/03/2017.
 */

import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.view.View;
import android.widget.Spinner;
import android.widget.AdapterView;
import android.widget.Toast;

import com.qrusial.wallet.R;

public class AddAccount extends AppCompatActivity {

    private Spinner spinner1;
    private EditText accountname;
    private TextInputLayout accountnamecontainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);

        accountname = (EditText) findViewById(R.id.accountName);
        accountnamecontainer = (TextInputLayout) findViewById(R.id.account_name_container);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        spinner1.setOnItemSelectedListener(new ItemSelectedListener());
    }

    public class ItemSelectedListener implements AdapterView.OnItemSelectedListener {

        String firstItem = String.valueOf(spinner1.getSelectedItem());

        public void onItemSelected(AdapterView<?> parent, View view, int pos, long id) {
            if (firstItem.equals(String.valueOf(spinner1.getSelectedItem()))) {

            } else {
                Toast.makeText(parent.getContext(),
                        "You have choose : " + parent.getItemAtPosition(pos).toString(),
                        Toast.LENGTH_LONG).show();
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> arg) {

        }

    }
}
