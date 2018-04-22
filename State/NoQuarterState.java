package State;

public class NoQuarterState implements State{

	private GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}
	
	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("you inserted quarter");
		this.gumballMachine.setState(this.gumballMachine.getHasQuarterState());
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}

}
