package State;

public class HasQuarterState implements State{

	private GumballMachine gumballMachine;
	
	public HasQuarterState(GumballMachine gumballMachine) {
		// TODO Auto-generated constructor stub
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuater() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}

	@Override
	public void ejectQuater() {
		// TODO Auto-generated method stub
		System.out.println("Eject quarter");
		this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turn crank");
		this.gumballMachine.setState(this.gumballMachine.getSoldState());
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("-");
	}

}
