package AbstractFactory;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new RedSauce();
	}

}
