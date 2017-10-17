package com.outerspace.daggerscone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.outerspace.daggerscone.model.Person;

public class MainActivity extends AppCompatActivity {

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        person = new Person();
        person.firstName = "Luis Jesús";
        person.lastNameF = "Virueña";
        person.lastNameM = "Silva";

        EditText edit;
        edit = (EditText) findViewById(R.id.first_name);
        edit.setText(person.firstName);
        edit = (EditText) findViewById(R.id.last_name_f);
        edit.setText(person.lastNameF);
        edit = (EditText) findViewById(R.id.last_name_m);
        edit.setText(person.lastNameM);
        
    }
}
