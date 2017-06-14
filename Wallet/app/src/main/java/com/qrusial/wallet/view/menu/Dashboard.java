package com.qrusial.wallet.view.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.qrusial.wallet.R;
import com.qrusial.wallet.model.entity.User;

/**
 * Created by Angsono Putra on 21/03/2017.
 */

public class Dashboard extends AppCompatActivity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        textView = (TextView) findViewById(R.id.first_wallet);


        textView.setText("IDR. " + User.loggedInUser.getDompet());
    }
}