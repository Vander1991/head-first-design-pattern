package szu.vander.impl3;

import java.awt.Component;
import java.awt.Graphics;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
* @author      : Vander
* @date        : 2018-08-20
* @description ： 
*/
public class AdvertisingImageProxy implements Icon{

	private static final int DEFAULT_WIDTH = 500;
	
	private static final int DEFAULT_HEIGHT = 1000;

	private Icon icon;
	
	private URL advertisingUrl;
	
	private Thread retrievalThread;
	
	boolean retrieving = false;
	
	public AdvertisingImageProxy(URL url) {
		advertisingUrl = url;
	}
	
	@Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
		if(icon != null) {
			icon.paintIcon(c, g, x, y);
		} else {
			g.drawString("Loading the advertising...", x + 200, y + 90);
			if(!retrieving) {
				retrieving = true;
				retrievalThread = new Thread(new Runnable() {
					public void run() {
						try {
							icon = new ImageIcon(advertisingUrl);
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
				});
				retrievalThread.start();
			}
		}
	}

	@Override
	public int getIconWidth() {
		if(icon != null) {
			return icon.getIconWidth();
		} else {
			return DEFAULT_WIDTH;
		}
	}

	@Override
	public int getIconHeight() {
		if(icon != null) {
			return icon.getIconHeight();
		} else {
			return DEFAULT_HEIGHT;
		}	
	}

}
