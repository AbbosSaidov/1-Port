package com.example.insigame.experiment_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.realm.Realm;

public class CreateActivity extends AppCompatActivity {
    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);
    }

    public void Viom(View view){
        realm = Realm.getDefaultInstance();
        // All writes are wrapped in a transaction
        // to facilitate safe multi threading
        realm.beginTransaction();

        // Add a person
        Person person = realm.createObject(Person.class);
        person.setCreatedEmail(true);


        realm.commitTransaction();

         finish();

        startActivity(new Intent(this,MenuActivity.class));
    }
}
