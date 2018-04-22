package Factory;

import java.util.ArrayList;

public class Pizza {

	String name;
	String dough;
	String sauce;
	ArrayList toppings = new ArrayList();
	
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings");
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println(" " + toppings.get(i));
		}
		
	}

	public void bake() {
		// TODO Auto-generated method stub
		System.out.println("backing");
	}

	public void cut() {
		// TODO Auto-generated method stub
		System.out.println("cutting");
	}

	public void box() {
		// TODO Auto-generated method stub
		System.out.println("boxing");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	

}
