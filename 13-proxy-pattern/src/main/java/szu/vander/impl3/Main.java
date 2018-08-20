package szu.vander.impl3;

import java.net.MalformedURLException;
import java.net.URL;

/**
* @author      : Vander
* @date        : 2018-08-20
* @description ： 
*/
public class Main {
	
	
	public static void main(String args[]) {
		URL url;
		try {
			
			url = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1535385832&di=e64ae1511584e26b7d2423c80a865832&imgtype=jpg&er=1&src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fq_70%2Cc_zoom%2Cw_640%2Fimages%2F20180705%2Fcdb77daacc4c40a8a635f58812f0d1da.jpeg");
			AdvertisingFrame advertisingFrame = new AdvertisingFrame(url);
			advertisingFrame.setVisible(true);
			advertisingFrame.setSize(650, 900); 
			advertisingFrame.display();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
}
