package com.telRan.model.model;

public class User {
    public String email;
    public String password;


    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public User withEmail(String email) {
        this.email = email;
        return this;
    }

    public User withPassword(String password) {
        this.password = password;
        return this;
    }
}
