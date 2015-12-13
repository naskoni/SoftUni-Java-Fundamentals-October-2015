package products;

import interfaces.Expirable;

import java.util.Date;

import enums.AgeRestriction;

public class FoodProduct extends Product implements Expirable {

    private Date expirationDate;

    @SuppressWarnings("deprecation")
	public FoodProduct(String name, double price, int quantity, AgeRestriction ageRestriction) {
        super(name, price, quantity, ageRestriction);

        this.expirationDate = new Date(new Date().getYear(), new Date().getMonth(), new Date().getDate() - 10);
    }

    @SuppressWarnings("deprecation")
	@Override
    public double getPrice() {
        double currentPrice = this.price();
        if (new Date().getDate() > this.getExpirationDate().getDate() - 15) {
            currentPrice *= 0.7;
        }
        return currentPrice;
    }

    @SuppressWarnings("deprecation")
	@Override
    public Date getExpirationDate() {
        return new Date(expirationDate.getYear(), expirationDate.getMonth() + 1, expirationDate.getDate());
    }

}
