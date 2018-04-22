package Visitor;

/**
 * Created by amitp on 12/12/16.
 */
public class Vcd implements  IVisitable, IShoppingItem{
    private double price;
    private double weight;

    public Vcd(double price, double weight)
    {
        this.price = price;
        this.weight = weight;
    }

    //accept the visitor
    public void futureAddOnMethodForDynamicWorkOnMe(IVisitor visitor) {
        visitor.visit(this);
    }

    public void play()
    {
        System.out.println("I am vcd, i play on vcd player only..");
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
