package szu.vander.impl2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import szu.vander.impl2.remote.BaseAutoSellerRemote;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class Client {

	public static void main(String[] args) throws RemoteException {
		String url = "rmi://localhost:1099/ShenZhen/coastalcity/autoSeller";
		BaseAutoSellerRemote autoSeller = null;
		try {
			 autoSeller = (BaseAutoSellerRemote) Naming.lookup(url);
		} catch (MalformedURLException | RemoteException | NotBoundException e1) {
			e1.printStackTrace();
		}
		
		List<BaseAutoSellerRemote> autoSellerList = new ArrayList<BaseAutoSellerRemote>();
		autoSellerList.add(autoSeller);
		AutoSellerMonitor autoSellerMonitor = new AutoSellerMonitor(autoSellerList);
		
		autoSellerMonitor.report();
		
	}
	
}
