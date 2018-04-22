package State;

public class SoldState implements State{

	private GumballMachine gumballMachine;

	public SoldState(GumballMachine gumballMachine) {
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
		this.gumballMachine.releaseBall();
		if(this.gumballMachine.getCount()>0)
		{
			this.gumballMachine.setState(this.gumballMachine.getNoQuarterState());
		}
		else
		{
			System.out.println("Oops, out of gumballs");
			this.gumballMachine.setState(this.gumballMachine.getSoldOutState());
		}
	}

}
