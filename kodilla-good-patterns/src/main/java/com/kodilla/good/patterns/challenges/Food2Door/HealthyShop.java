package com.kodilla.good.patterns.challenges.Food2Door;

public class HealthyShop {

    private String nameOfCompany;
    private int amountOfProducts;

    public HealthyShop(String nameOfCompany, int amountOfProducts) {
        this.nameOfCompany = nameOfCompany;
        this.amountOfProducts = amountOfProducts;
    }

    public String getNameOfCompany() {
        return nameOfCompany;
    }

    public int getAmountOfProducts() {
        return amountOfProducts;
    }

}
