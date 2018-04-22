package Adapters;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck realDuck = new RealDuck();
		realDuck.quack();
		realDuck.fly();
		
		/*Mankind realPeople = new People();
		realPeople.speak();
		realPeople.walk();*/
		
		Duck adaptedPeople = new MankindAdapter(new People());
		adaptedPeople.quack();
		adaptedPeople.fly();
	}

}
