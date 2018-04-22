package AbstractFactory;

public class VegPizza extends Pizza {

	PizzaIngredientFactory pizzaIngredientFactory;

	/**
	 * @param pizzaIngredientFactory
	 */
	public VegPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		super();
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Preparing VegPizza");
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
	}	
}
