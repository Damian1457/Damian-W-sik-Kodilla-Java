package com.kodilla.stream.invoice.simple;

import com.kodilla.stream.invoicesimple2.SimpleInvoice;
import com.kodilla.stream.invoicesimple2.SimpleItem;
import com.kodilla.stream.invoicesimple2.SompleProduct;
import org.junit.jupiter.api.Test;

import static org.testng.Assert.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SompleProduct("Product 1",17.28), 2.0));
        invoice.addItem(new SimpleItem(new SompleProduct("Product 2",11.99), 3.5));
        invoice.addItem(new SimpleItem(new SompleProduct("Product 3",6.49), 5.0));

        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);


    }
}