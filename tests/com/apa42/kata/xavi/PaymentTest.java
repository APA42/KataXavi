package com.apa42.kata.xavi;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import java.util.List;

/**
 * Created by APA42 on 07/05/15.
 */
public class PaymentTest {
    //1 - If the payment is for a physical product, generate a packing slip for shipping.
    private Payment myPayment;
    private PhysicalProduct aPhysicalProduct;

    @Spy
    private Sender aSender;

    @Before
    public void before(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void whenPhysicalProductThenGeneratePackingSlip() {
        aPhysicalProduct = new PhysicalProduct();
        myPayment = new Payment();

        ShippingSlip result = myPayment.payForPhysicalProduct(aPhysicalProduct);

        ShippingSlip expectedResult = new ShippingSlip("data");
        org.junit.Assert.assertEquals(result.data(), expectedResult.data());
    }

    //2 - If the payment is for a book, create a duplicate packing slip for the royalty department.
    @Test
    public void whenBookProductThenCreateDuplicatePackingSlip() {
        BookProduct book = new BookProduct();
        myPayment = new Payment();

        List<ShippingSlip> result = myPayment.payForBookProduct(book);

        Assert.assertEquals(result.get(0).data(), result.get(1).data());
    }

    @Test
    public void whenBookProductThenCreateDuplicatePackingSlipAndSendToRoyaltyDepartment() {
        BookProduct book = new BookProduct();

        myPayment = new Payment(aSender);

        List<ShippingSlip> result = myPayment.payForBookProduct(book);

        Assert.assertEquals(result.get(0).data(), result.get(1).data());
}
