package Visitor;

/**
 * Created by amitp on 12/12/16.
 */
public interface IVisitable extends IShoppingItem {
    public void futureAddOnMethodForDynamicWorkOnMe(IVisitor visitor);
}
