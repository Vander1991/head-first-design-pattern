package szu.vander.swing;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setSize(300, 300);
		this.setVisible(true);
	}
	
	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "09-Template-Method-Pattern";
		graphics.drawString(msg, 80, 150);
	}
	
}
