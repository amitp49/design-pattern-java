package Visitor;

/**
 * Created by amitp on 12/12/16.
 */
public class OffLineStoreVisitor implements IVisitor  {

    private double totalDiscountForCart;

    @Override
    public void visit(IShoppingItem item) {
        if(item.getPrice() > 5) {
            totalDiscountForCart += 1;
        }
    }

    public double getTotalDiscount()
    {
        return totalDiscountForCart;
    }
}
