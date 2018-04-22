package AbstractFactory;

public class CheesePizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;

	/**
	 * @param pizzaIngredientFactory
	 */
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing CheesePizza");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
	}
	
	
}
