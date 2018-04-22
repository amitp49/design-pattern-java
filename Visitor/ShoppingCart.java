package Visitor;

import java.util.ArrayList;

/**
 * Created by amitp on 12/12/16.
 */
public class ShoppingCart {
    //normal shopping cart stuff
    private ArrayList<IVisitable> items;

    public ShoppingCart(ArrayList<IVisitable> items)
    {
        this.items = items;
    }

    public double calculatePostage() {
        //create a visitor
        PostageVisitor postageVisitor = new PostageVisitor();
        //iterate through all items
        for(IVisitable item: items) {
            item.futureAddOnMethodForDynamicWorkOnMe(postageVisitor);
        }
        double postage = postageVisitor.getTotalPostage();
        return postage;
    }

    public double calculateOfflineDiscount() {
        //create a visitor
        OffLineStoreVisitor offLineStoreVisitor = new OffLineStoreVisitor();
        //iterate through all items
        for(IVisitable item: items) {
            item.futureAddOnMethodForDynamicWorkOnMe(offLineStoreVisitor);
        }
        double discount = offLineStoreVisitor.getTotalDiscount();
        return discount;
    }
}
