package szu.vander.remoteproxy;
/**
* @author      : Vander
* @date        : 2018-08-17
* @description ： 
*/

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

import szu.vander.remoteproxy.remote.AutoSeller;
import szu.vander.remoteproxy.remote.BaseAutoSellerRemote;

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
