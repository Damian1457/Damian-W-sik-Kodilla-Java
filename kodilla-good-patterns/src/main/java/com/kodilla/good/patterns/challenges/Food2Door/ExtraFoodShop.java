package com.kodilla.good.patterns.challenges.Food2Door;

public class ExtraFoodShop {

   private String nameOfCompany;
   private int amountOfProducts;

    public ExtraFoodShop(String nameOfCompany, int amountOfProducts) {
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
