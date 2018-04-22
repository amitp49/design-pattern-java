package AbstractFactory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nyStore = new NYPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ny:" + pizza.getName());
		
		Pizza pizza1 = nyStore.orderPizza("veg");
		System.out.println("Ny:" + pizza1.getName());
		
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza2 = chicagoStore.orderPizza("cheese");
		System.out.println("Chicago:" + pizza2.getName());
		
		Pizza pizza3 = chicagoStore.orderPizza("veg");
		System.out.println("Chicago:" + pizza3.getName());
		
	}

}
