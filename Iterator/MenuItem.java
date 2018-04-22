package Iterator;

public class MenuItem {
	String name;
	String desc;
	boolean vegetarian;
	double price;
	/**
	 * @param name
	 * @param desc
	 * @param vegetarian
	 * @param price
	 */
	public MenuItem(String name, String desc, boolean vegetarian, double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.vegetarian = vegetarian;
		this.price = price;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	
	
}
