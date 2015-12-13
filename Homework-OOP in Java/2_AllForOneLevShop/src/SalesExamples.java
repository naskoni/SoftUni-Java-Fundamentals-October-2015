import java.util.ArrayList;
import java.util.List;

import enums.AgeRestriction;
import products.Appliance;
import products.Computer;
import products.FoodProduct;
import products.Product;

public class SalesExamples {
    public static void main(String[] args) {
    	FoodProduct cigars = new FoodProduct("420 Blaze it fgt", 6.90, 1400, AgeRestriction.Adult);
    	Customer pecata = new Customer("Pecata", 17, 30.00);

        try {
        	PurchaseManager.processPurchase(pecata, cigars);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        Customer gopeto = new Customer("Gopeto", 18, 0.44);
        try {
        	PurchaseManager.processPurchase(gopeto, cigars);            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        
        System.out.println(pecata.getBalance());
        System.out.println(gopeto.getBalance());
        
        List<Product> products = new ArrayList<>();
        products.add(new FoodProduct("Wine", 4.88, 33, AgeRestriction.Adult));
        products.add(new FoodProduct("Bread", 0.99, 89, AgeRestriction.None));
        products.add(new FoodProduct("Cheese", 10.88, 500, AgeRestriction.None));
        products.add(new FoodProduct("Vodka", 9.99, 15, AgeRestriction.Adult));
        products.add(new Computer("HP", 1899.95, 2, AgeRestriction.None));
        products.add(new Computer("Dell", 2.899, 14, AgeRestriction.None));
        products.add(new Computer("Lenovo", 999, 1, AgeRestriction.None));
        products.add(new Appliance("Oven", 499, 156, AgeRestriction.Teenager));
        products.add(new Appliance("TV", 1499.9, 16, AgeRestriction.None));
        products.add(new Appliance("Refrigerator", 4, 0, AgeRestriction.Teenager));

        System.out.println();
        products.stream()
                .filter(product -> product.getAgeRestriction().equals(AgeRestriction.Adult))
                .sorted((o1, o2) -> Double.compare(o1.getPrice(), o2.getPrice()))
                .forEach(product1 -> System.out.println(product1.getName() + ": " + product1.getPrice()));

    }
    
}
