package AbstractFactory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
		
		if(type.equals("cheese")){
			pizza =  new CheesePizza(pizzaIngredientFactory);
			pizza.setName("ChicagoPizzaStore - Cheese Pizza");
		}
		else if(type.equals("veg")){
			pizza =  new VegPizza(pizzaIngredientFactory);
			pizza.setName("ChicagoPizzaStore - Veg Pizza");
		}
		// TODO Auto-generated method stub
		return pizza;
	}	
}
