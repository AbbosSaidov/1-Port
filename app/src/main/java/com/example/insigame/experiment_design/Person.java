package com.example.insigame.experiment_design;


import io.realm.RealmObject;

public class Person extends RealmObject {

    public String Name;
    public String Email;
    public String Password;
    public Boolean CreatedEmail;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Boolean getCreatedEmail() {
        return CreatedEmail;
    }

    public void setCreatedEmail(Boolean createdEmail) {
        CreatedEmail = createdEmail;
    }
}
