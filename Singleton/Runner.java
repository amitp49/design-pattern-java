package Singleton;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = SingletonClass.getInstance();
		
		if(obj1 == obj2)
			System.out.println("equals");
		
		obj1.printMe();
		obj2.printMe();
	}

}
