package TemplateMethod;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CaffeineBeverage caffeineBeverage = new Tea();
		caffeineBeverage.prepareRecipe();
		
		CaffeineBeverage caffeineBeverage1 = new Coffee();
		caffeineBeverage1.prepareRecipe();
	}

}
