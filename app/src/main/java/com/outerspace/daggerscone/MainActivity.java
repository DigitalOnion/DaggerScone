package com.outerspace.daggerscone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
    public Person anyone;

    @Inject
    public Person someone;

    private boolean bShowSomeone = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        component = DaggerSconeComponent.builder().build();
        component.inject(this);

        anyone.firstName = this.getResources().getString(R.string.unknown_first_name);
        anyone.lastNameF = this.getResources().getString(R.string.unknown_last_name_f);
        anyone.lastNameM = this.getResources().getString(R.string.unknown_last_name_m);

        someone.firstName = "Luis Jesús";
        someone.lastNameF = "Virueña";
        someone.lastNameM = "Silva";
    }

    @Override
    protected void onStart() {
        super.onStart();

        bShowSomeone = true;
        displayPerson();
    }

    public void onClickBtnChangePerson(View view) {
        bShowSomeone = !bShowSomeone;
        displayPerson();
    }

    private void displayPerson() {
        Person person = null;
        if(bShowSomeone)
            person = someone;
        else
            person = anyone;

        EditText edit;
        edit = (EditText) findViewById(R.id.first_name);
        edit.setText(person.firstName);
        edit = (EditText) findViewById(R.id.last_name_f);
        edit.setText(person.lastNameF);
        edit = (EditText) findViewById(R.id.last_name_m);
        edit.setText(person.lastNameM);
    }
}
