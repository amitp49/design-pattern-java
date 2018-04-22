package Decorator;

public abstract class Beverage {

	String description = "Unknown beveraqes";
	
	
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
