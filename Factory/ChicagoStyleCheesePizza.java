package Factory;

public class ChicagoStyleCheesePizza extends Pizza {

	public ChicagoStyleCheesePizza() {
		// TODO Auto-generated constructor stub
		name = "ChicagoStyleCheesePizza";
		dough = "Thin";
		sauce = "Marina";
		
		toppings.add("Great cheese");
	}
	
	public void cut()
	{
		System.out.println("Cutting - ChicagoStyleCheesePizza");
	}
}
