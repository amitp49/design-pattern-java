package Adapters;

public class MankindAdapter implements Duck{
	Mankind mankind;

	/**
	 * @param mankind
	 */
	public MankindAdapter(Mankind mankind) {
		super();
		this.mankind = mankind;
	}

	@Override
	public void quack() {
		// TODO Auto-generated method stub
		mankind.speak();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		mankind.walk();
	}
}
