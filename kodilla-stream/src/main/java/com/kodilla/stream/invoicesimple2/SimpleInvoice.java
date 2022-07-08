package com.kodilla.stream.invoicesimple2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public final class SimpleInvoice {

    private final List<SimpleItem> theProduct = new ArrayList<>();

    public void addItem(SimpleItem simpleItem) {
        theProduct.add(simpleItem);
    }

    public boolean removeItem(SimpleItem simpleItem) {
        return theProduct.remove(simpleItem);
    }

    public double getValueToPay() {
        return theProduct.stream()
                .collect(Collectors.summingDouble(SimpleItem::getValue));
    }

}
