package State;

public class GumballMachine {
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state = soldOutState;
	
	int count = 0;
	/**
	 * @param count
	 */
	public GumballMachine(int numberOfGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		
		this.count = numberOfGumballs;
		
		if(numberOfGumballs > 0)
		{
			state = noQuarterState;
		}
	}
	
	public void insertQuater() {
		// TODO Auto-generated method stub
		state.insertQuater();
	}

	public void ejectQuater() {
		// TODO Auto-generated method stub
		state.ejectQuater();
	}
	public void turnCrank() {
		// TODO Auto-generated method stub
		state.turnCrank();
		state.dispense();
		
	}
	
	public void releaseBall()
	{
		System.out.println("Rolling out ball");
		if(count!=0)
		{
			count--;
		}
	}
	
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	/**
	 * @return the state
	 */
	public State getState() {
		return state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(State state) {
		this.state = state;
	}
	
	/**
	 * @return the soldOutState
	 */
	public State getSoldOutState() {
		return soldOutState;
	}
	/**
	 * @return the noQuarterState
	 */
	public State getNoQuarterState() {
		return noQuarterState;
	}
	/**
	 * @return the hasQuarterState
	 */
	public State getHasQuarterState() {
		return hasQuarterState;
	}
	/**
	 * @return the soldState
	 */
	public State getSoldState() {
		return soldState;
	}
	/**
	 * @param soldOutState the soldOutState to set
	 */
	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}
	/**
	 * @param noQuarterState the noQuarterState to set
	 */
	public void setNoQuarterState(State noQuarterState) {
		this.noQuarterState = noQuarterState;
	}
	/**
	 * @param hasQuarterState the hasQuarterState to set
	 */
	public void setHasQuarterState(State hasQuarterState) {
		this.hasQuarterState = hasQuarterState;
	}
	/**
	 * @param soldState the soldState to set
	 */
	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.state + " : " + count;
	}
}
