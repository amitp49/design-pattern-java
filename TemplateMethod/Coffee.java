package TemplateMethod;

public class Coffee extends CaffeineBeverage{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("Filter - coffee");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("Adding suger free for coffee");
	}

	@Override
	public boolean customerWantsCondiments() {
		// TODO Auto-generated method stub
		return false;
	}
}
