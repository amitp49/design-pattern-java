package Visitor;

/**
 * Created by amitp on 12/12/16.
 */

public class Book implements  IVisitable, IShoppingItem{
    private double price;
    private double weight;

    public Book(double price, double weight)
    {
        this.price = price;
        this.weight = weight;
    }

    //accept the visitor
    public void futureAddOnMethodForDynamicWorkOnMe(IVisitor visitor) {
        visitor.visit(this);
    }

    public void read()
    {
        System.out.println("I am book, i can be read anywhere...");
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWeight() {
        return weight;
    }
}

