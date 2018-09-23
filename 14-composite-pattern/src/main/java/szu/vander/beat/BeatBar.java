package szu.vander.beat;

import javax.swing.JProgressBar;

/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public class BeatBar extends JProgressBar implements Runnable {

	private static final long serialVersionUID = 3038139590407514262L;
	
	JProgressBar progressBar;
	
	Thread thread;
 
	public BeatBar() {
		thread = new Thread(this);
		setMaximum(100);
		thread.start();
	}
 
	public void run() {
		while(true) {
			int value = getValue();
			value = (int)(value * 0.75);
			setValue(value);
			repaint();
			try {
				Thread.sleep(50);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
