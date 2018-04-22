package State;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.println(gumballMachine);
		
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuater();
		gumballMachine.ejectQuater();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		gumballMachine.ejectQuater();
		
		System.out.println(gumballMachine);
		gumballMachine.insertQuater();
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		gumballMachine.insertQuater();
		gumballMachine.turnCrank();
		
		System.out.println(gumballMachine);
	}

}
