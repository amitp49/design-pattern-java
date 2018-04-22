package AbstractFactory;

public class NYPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
		
		if(type.equals("cheese")){
			pizza =  new CheesePizza(pizzaIngredientFactory);
			pizza.setName("NYPizzaStore - Cheese Pizza");
		}
		else if(type.equals("veg")){
			pizza =  new VegPizza(pizzaIngredientFactory);
			pizza.setName("NYPizzaStore - Veg Pizza");
		}
		// TODO Auto-generated method stub
		return pizza;
	}

	
}
