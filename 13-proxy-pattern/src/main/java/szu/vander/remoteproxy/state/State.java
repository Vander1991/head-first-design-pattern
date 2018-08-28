package szu.vander.remoteproxy.state;

import java.io.Serializable;

/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public interface State extends Serializable {
	
	public void insertTenYuan();
	
	public void ejectTenYuan();
	
	public void pressSellButton();
	
	public void dispense();
	
}
