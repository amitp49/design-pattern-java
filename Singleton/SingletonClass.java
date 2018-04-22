package Singleton;

public class SingletonClass {
	private volatile static SingletonClass uniqueInstance; // = new SingletonClass();
	
	private SingletonClass()
	{
		
	}
	
	public static SingletonClass getInstance()
	{
		if(uniqueInstance == null)
		{
			synchronized (SingletonClass.class) {
				if(uniqueInstance == null)
				{
					uniqueInstance = new SingletonClass();		
				}
			}
		}
		return uniqueInstance;
	}
	
	public void printMe()
	{
		System.out.println("Hey,, you just printed me");
	}
}
