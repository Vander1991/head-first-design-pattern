package szu.vander.impl3;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class AutoSeller {

	private State noTenYuanState;
	
	private State hasTenYuanState;
	
	private State soldOutState;
	
	private State soldState;
	
	private State winnerState;
	
	private int count;
	
	private State state = soldOutState;
	

	public AutoSeller(int count) {
		super();
		this.noTenYuanState = new NoTenYuanState(this);
		this.hasTenYuanState = new HasTenYuanState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.count = count;
		if(count > 0) {
			state = noTenYuanState;
		}
	}
	
	public void insertTenYuan() {
		state.insertTenYuan();
		System.out.println(state.getClass().getSimpleName());
	}

	public void ejectTenYuan() {
		state.ejectTenYuan();
		System.out.println(state.getClass().getSimpleName());
	}
	
	public void pressSellButton() {
		state.pressSellButton();
		System.out.println(state.getClass().getSimpleName());
		state.dispense();
		System.out.println(state.getClass().getSimpleName());
	}
	
	public void dispense() {
		System.out.println("Giving you a cup of judge");
		if(count != 0) {
			count = count - 1; 
		}
	}
	public void setState(State state) {
		this.state = state;
	}

	public int getCount() {
		return count;
	}

	public State getNoTenYuanState() {
		return noTenYuanState;
	}

	public void setNoTenYuanState(State noTenYuanState) {
		this.noTenYuanState = noTenYuanState;
	}

	public State getHasTenYuanState() {
		return hasTenYuanState;
	}

	public void setHasTenYuanState(State hasTenYuanState) {
		this.hasTenYuanState = hasTenYuanState;
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public void setSoldOutState(State soldOutState) {
		this.soldOutState = soldOutState;
	}

	public State getSoldState() {
		return soldState;
	}

	public void setSoldState(State soldState) {
		this.soldState = soldState;
	}

	public State getWinnerState() {
		return winnerState;
	}

	public void setWinnerState(State winnerState) {
		this.winnerState = winnerState;
	}
	
}
