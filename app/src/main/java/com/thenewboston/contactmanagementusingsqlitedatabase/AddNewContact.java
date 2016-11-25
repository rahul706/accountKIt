package com.thenewboston.contactmanagementusingsqlitedatabase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddNewContact extends AppCompatActivity {

    EditText name,mobile_number,email;
    Button save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_contact);

        name = (EditText) findViewById(R.id.etName);
        mobile_number = (EditText) findViewById(R.id.enMobileNumber);
        email= (EditText) findViewById(R.id.etEmail);
        save = (Button) findViewById(R.id.btnSave);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
