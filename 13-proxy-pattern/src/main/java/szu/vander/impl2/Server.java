package szu.vander.impl2;
/**
* @author      : Vander
* @date        : 2018-08-17
* @description ： 
*/

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import szu.vander.impl2.remote.AutoSeller;
import szu.vander.impl2.remote.BaseAutoSellerRemote;

public class Server {

	public static void main(String args[]) {
		
		BaseAutoSellerRemote autoSeller = null;
		try {
			autoSeller = new AutoSeller("autoSeller", 10);
			Naming.rebind("rmi://localhost:1099/ShenZhen/coastalcity/autoSeller", autoSeller);
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
	}
	
	
}
