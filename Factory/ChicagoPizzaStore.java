package Factory;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if(type.equals("cheese"))
		{
			return new ChicagoStyleCheesePizza();
		}
		else if(type.equals("veg"))
		{
			return new ChicagoStyleVegPizza();
		}
		return null;
	}

}
