package szu.vander.impl2.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

import szu.vander.impl2.state.State;

/**
* @author      : Vander
* @date        : 2018-08-17
* @description ： 
*/
public interface BaseAutoSellerRemote extends Remote {

	public String getLocation() throws RemoteException;
	
	public State getState() throws RemoteException;
	
	public int getCount() throws RemoteException;
	
}
