package com.example.jatinparab.eaton.Model;

/**
 * Created by jatinparab on 12/09/17.
 */

public class User {
    private String Name;
    private String Password;

    public User(){

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public User(String name, String password) {
        Name = name;
        Password = password;
    }
}
