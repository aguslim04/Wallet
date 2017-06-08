package com.qrusial.wallet.view.menu;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.qrusial.wallet.R;


/**
 * Created by Agus Manto on 04/06/2017.
 */

public class RecordIncome extends AppCompatActivity {

    TextView value, item;
    String get_value,get_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.record_income);

        item = (TextView) findViewById(R.id.textItem);
        value = (TextView) findViewById(R.id.textValue);

        Bundle b = getIntent().getExtras();

        get_item = b.getString("parse_item");
        get_value = b.getString("parse_value");

        item.setText(get_item + " = Rp.");
        value.setText(get_value);



    }

}
