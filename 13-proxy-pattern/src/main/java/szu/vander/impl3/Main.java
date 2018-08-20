package szu.vander.impl3;

import java.awt.Component;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
* @author      : Vander
* @date        : 2018-08-20
* @description ： 
*/
public class Main {
	
	private static URL advertisingUrl;
	JFrame frame;
	
	public static void main(String args[]) {
		

	}
	
	public Main() {
		Icon icon = new AdvertisingProxy(advertisingUrl);
	}
	
}
