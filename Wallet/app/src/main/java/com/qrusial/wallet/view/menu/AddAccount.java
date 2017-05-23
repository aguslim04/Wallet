package com.qrusial.wallet.view.menu;

/**
 * Created by Agus Manto on 21/03/2017.
 */

import android.graphics.Paint;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.qrusial.wallet.R;

public class AddAccount extends AppCompatActivity {

    private EditText accountname;
    private TextInputLayout accountnamecontainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_account);

        accountname = (EditText) findViewById(R.id.accountName);
        accountnamecontainer = (TextInputLayout) findViewById(R.id.account_name_container);
    }
}
