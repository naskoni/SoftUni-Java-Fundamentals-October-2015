import enums.AgeRestriction;
import exceptions.NoMoneyException;
import exceptions.NoPermissionException;
import exceptions.NoQuantityException;
import exceptions.ProductExpiredException;
import products.FoodProduct;
import products.Product;

import java.util.Date;

public final class PurchaseManager {

    public static void processPurchase(Customer customer, Product product) throws NoPermissionException, NoMoneyException, NoQuantityException, ProductExpiredException {

        if (product.getAgeRestriction() == AgeRestriction.Adult && customer.getAge() < 18) {
            throw new NoPermissionException();
        } else if (product.getAgeRestriction() == AgeRestriction.Teenager && customer.getAge() < 14) {
            throw new NoPermissionException();
        } else if (customer.getBalance() - product.getPrice() < 0) {
            throw new NoMoneyException();
        } else if (product.getQuantity() < 1) {
            throw new NoQuantityException();
        } else if (product instanceof FoodProduct) {
            FoodProduct productCast = (FoodProduct) product;
            if (productCast.getExpirationDate().getTime() < new Date().getTime()) {
                throw new ProductExpiredException();
            }
        }

        product.setQuantity(product.getQuantity() - 1);
        customer.setBalance(customer.getBalance() - product.getPrice());
    }
}
