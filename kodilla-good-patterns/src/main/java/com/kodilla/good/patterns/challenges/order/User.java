package com.kodilla.good.patterns.challenges.order;

public class User {

    private String userName;
    private String email;

    private String address;

    public User(String userName, String email, String address) {
        this.userName = userName;
        this.email = email;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }
    public String getAddress() {
        return address;
    }
    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
