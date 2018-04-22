package TemplateMethod;

public class Tea extends CaffeineBeverage {

	
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Tea - filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding white suger");
	}

	@Override
	public void hook() {
		// TODO Auto-generated method stub
		super.hook();
		System.out.println("Let it get it cool before serve");
	}
}
