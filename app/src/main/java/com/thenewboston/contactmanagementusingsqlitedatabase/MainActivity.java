package com.thenewboston.contactmanagementusingsqlitedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        databaseHelper databaseHelper;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseHelper = new databaseHelper(this);
    }
}

    