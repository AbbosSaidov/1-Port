package com.example.insigame.experiment_design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import io.realm.Realm;
import io.realm.RealmResults;


public class MainActivity extends AppCompatActivity {

    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout);
        Realm.init(this);

        //tekshirish
        realm = Realm.getDefaultInstance();
        realm.beginTransaction();

        RealmResults<Person> realmCities= realm.where(Person.class).findAllAsync();
        //fetching the data
        realmCities.load();

        Boolean aBoolean= false;
        for(Person person:realmCities){
            aBoolean = person.getCreatedEmail();
        }


        if(aBoolean==null || !aBoolean){
            startActivity(new Intent(this,CreateActivity.class));
        }else {
            startActivity(new Intent(this,MenuActivity.class));
        }
        realm.commitTransaction();
}

    public void As(View view){

    }
}
