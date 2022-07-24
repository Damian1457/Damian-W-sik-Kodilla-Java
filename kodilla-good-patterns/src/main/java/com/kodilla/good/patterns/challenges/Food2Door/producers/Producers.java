package com.kodilla.good.patterns.challenges.Food2Door.producers;

import com.kodilla.good.patterns.challenges.Food2Door.products.Products;

public interface Producers {

    boolean process(final Products products, final int quantity);

}
