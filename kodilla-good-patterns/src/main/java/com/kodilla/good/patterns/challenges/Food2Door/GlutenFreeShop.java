package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop {

    private String nameOfCompany;
    private int amountOfProducts;

    public GlutenFreeShop(String nameOfCompany, int amountOfProducts) {
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
