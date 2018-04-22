package AbstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new GreenSauce();
	}

}
