package TemplateMethod;

public abstract class CaffeineBeverage {

	final void prepareRecipe()
	{
		boilWater();
		brew();
		pourInWater();
		if(customerWantsCondiments())
			addCondiments();
		
		hook(); //subclass can override it to add something at last
	}
	
	

	abstract void brew();
	abstract void addCondiments();

	final void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("Boil water");
		takeWater();
		stemWater();
	}
	
	private void stemWater() {
		// TODO Auto-generated method stub
		System.out.println("stem water");
	}

	private void takeWater() {
		// TODO Auto-generated method stub
		System.out.println("take water");
	}

	final void pourInWater() {
		// TODO Auto-generated method stub
		System.out.println("Pouring into Cup");	
	}
	
	//hook with default value - can be override by subclass
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return true;
	}
	
	//hook to add more behaviour
	public void hook()
	{
		
	}
}
