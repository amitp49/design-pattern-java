package Factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ny:" + pizza.getName());
		
		Pizza pizza1 = chicagoStore.orderPizza("veg");
		System.out.println("Chicago:" + pizza1.getName());
	}

}
