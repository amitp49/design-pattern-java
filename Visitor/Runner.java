package Visitor;

import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {

	    ArrayList<IVisitable> items = new ArrayList<>();
	    items.add(new Book(8,2));
        items.add(new Vcd(11,1));
        ShoppingCart shoppingCart = new ShoppingCart(items);

	    System.out.println("Parcel postage charge: " +  shoppingCart.calculatePostage());
        System.out.println("Offline store discount: " +  shoppingCart.calculateOfflineDiscount());
    }
}
