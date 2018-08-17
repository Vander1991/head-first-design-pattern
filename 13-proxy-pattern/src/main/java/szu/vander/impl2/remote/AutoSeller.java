package szu.vander.impl2.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import szu.vander.impl2.state.HasTenYuanState;
import szu.vander.impl2.state.NoTenYuanState;
import szu.vander.impl2.state.SoldOutState;
import szu.vander.impl2.state.SoldState;
import szu.vander.impl2.state.State;
import szu.vander.impl2.state.WinnerState;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class AutoSeller extends UnicastRemoteObject implements BaseAutoSellerRemote {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2239543739094752677L;

	private State noTenYuanState;
	
	private State hasTenYuanState;
	
	private State soldOutState;
	
	private State soldState;
	
	private State winnerState;
	
	private int count;
	
	private String location;

	private State state = soldOutState;
	

	
	
	public AutoSeller() throws RemoteException {
		super();
	}

	public AutoSeller(String location, int count) throws RemoteException {
		this.noTenYuanState = new NoTenYuanState(this);
		this.hasTenYuanState = new HasTenYuanState(this);
		this.soldOutState = new SoldOutState(this);
		this.soldState = new SoldState(this);
		this.winnerState = new WinnerState(this);
		this.count = count;
		this.location= location;
		if(count > 0) {
			state = noTenYuanState;
		}
	}
	
	public String getLocation() {
		return location;
	}
	
	public State getState() {
		return state;
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
