package Strategy;
/**
 * 
 */

/**
 * @author ampatel
 *
 */
public class ModelDuck extends Duck{

	/**
	 * 
	 */
	public ModelDuck() {
		// TODO Auto-generated constructor stub
		
		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("I am model duck's display");
	}

}
