package com.apa42.kata.xavi;

import com.sun.source.tree.AssertTree;
import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by APA42 on 07/05/15.
 */
public class PaymentTest {
    //1 - If the payment is for a physical product, generate a packing slip for shipping.
    private Payment myPayment;
    private PhysicalProduct aPhysicalProduct;

    @Test
    public void whenPhysicaProductThenGeneratePackingSlip() {
        aPhysicalProduct = new PhysicalProduct();

        myPayment = new Payment();

        ShippingSlip result = myPayment.payForPhysicalProduct(aPhysicalProduct);

        //org.junit.Assert.

        ShippingSlip expectedResult = new ShippingSlip("data");

        Assert.assertEquals(result, expectedResult);


    }
}
