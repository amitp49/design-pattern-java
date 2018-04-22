package AbstractFactory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	Dough dough;
	Sauce sauce;
	
	public abstract void prepare();

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
