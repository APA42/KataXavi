package com.apa42.kata.xavi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by APA42 on 07/05/15.
 */
public class Payment {
    public ShippingSlip payForPhysicalProduct(PhysicalProduct aPhysicalProduct) {
        return new ShippingSlip("data");
    }

    public List<ShippingSlip> payForBookProduct(BookProduct book) {
        ArrayList<ShippingSlip> aux = new ArrayList<ShippingSlip>();
        aux.add(new ShippingSlip("book"));
        aux.add(new ShippingSlip("book"));
        return aux;
    }
}
