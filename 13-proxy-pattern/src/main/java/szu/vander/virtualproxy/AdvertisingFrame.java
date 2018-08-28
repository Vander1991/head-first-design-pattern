package szu.vander.virtualproxy;

import java.net.URL;

import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
* @author : Vander Choi
* @date : 2018-08-20
* @description :
*/
public class AdvertisingFrame extends JFrame {

	private static final long serialVersionUID = -7932259334035100156L;
	
	private URL advertisingUrl;
	
	public AdvertisingFrame(URL url) {
		this.advertisingUrl = url;
	}
	
	public void display() {
		Icon icon = new AdvertisingImageProxy(advertisingUrl);
		JLabel label = new JLabel(icon);
		JPanel panel = new JPanel();
		panel.add(label);
		this.add(panel);
	}
	
}
