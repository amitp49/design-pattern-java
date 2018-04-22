package Strategy;
/**
 * 
 */

/**
 * @author ampatel
 *
 */
public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	/**
	 * 
	 */
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public abstract void display();
	
	public void performFly()
	{
		flyBehavior.fly();
	}
	
	public void performQuack()
	{
		quackBehavior.quack();
	}
	
	public void swim()
	{
		System.out.println("All ducks swims.");
	}

	/**
	 * @param flyBehavior the flyBehavior to set
	 */
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	/**
	 * @param quackBehavior the quackBehavior to set
	 */
	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
	
	
}
