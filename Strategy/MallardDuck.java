package Strategy;
/**
 * 
 */

/**
 * @author ampatel
 *
 */
public class MallardDuck extends Duck {

	/**
	 * 
	 */
	public MallardDuck() {
		super();
		
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am MallardDuck - extending Duck");
	}
	
		
}
