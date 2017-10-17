package com.outerspace.daggerscone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.outerspace.daggerscone.component.DaggerSconeComponent;
import com.outerspace.daggerscone.component.SconeComponent;
import com.outerspace.daggerscone.model.Person;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

public class MainActivity extends AppCompatActivity {

    private SconeComponent component;

    @Inject
    public Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerSconeComponent.builder().build();
    }

    @Override
    protected void onStart() {
        super.onStart();

        component.inject(this);

        EditText edit;
        edit = (EditText) findViewById(R.id.first_name);
        edit.setText(person.firstName);
        edit = (EditText) findViewById(R.id.last_name_f);
        edit.setText(person.lastNameF);
        edit = (EditText) findViewById(R.id.last_name_m);
        edit.setText(person.lastNameM);
        
    }
}
