package szu.vander.gui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
* @author : Vander Choi
* @date : 2018-03-22
* @description :
*/
public class SwingObserverExample {

	JFrame frame;
	
	public static void main(String[] args) {
		SwingObserverExample swingObserverExample = new SwingObserverExample();
		swingObserverExample.go();
	}
	
	public void go() {
		frame = new JFrame();
		JButton button = new JButton("Should I do it ? ");
		button.addActionListener(new AngelListener());
		button.addActionListener(new DevilListener());
		frame.setVisible(true);
		frame.setSize(500, 500); 
		frame.getContentPane().add(BorderLayout.CENTER, button);
	}
	
	class AngelListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("Don't do it");
		}
		
	}
	
	class DevilListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			System.out.println("please do it");
		}
		
	}
	
}
