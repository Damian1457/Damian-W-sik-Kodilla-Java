package com.kodilla.good.patterns.challenges.order;

public class User {

    private String userName;
    private String adres;
    private String email;

    public User(String userName, String email, String adres) {
        this.userName = userName;
        this.email = email;
        this.adres = adres;
    }

    public String getAdres() {
        return adres;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
}
