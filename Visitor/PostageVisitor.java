package Visitor;

/**
 * Created by amitp on 12/12/16.
 */
public class PostageVisitor implements IVisitor {
    private double totalPostageForCart;
    //collect data about the book
    public void visit(IShoppingItem item) {
        //assume we have a calculation here related to weight and price
        //free postage for a book over 10
        if(item.getPrice() < 10.0) {
            totalPostageForCart += item.getWeight() * 2;
        }
    }

    public double getTotalPostage() {
        return totalPostageForCart;
    }
}
