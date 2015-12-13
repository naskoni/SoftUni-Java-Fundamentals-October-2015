package products;

import java.util.Date;

import enums.AgeRestriction;

public abstract class ElectonicsProduct extends Product {
    protected Date guaranteePeriod;

    public ElectonicsProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);
    }
}
