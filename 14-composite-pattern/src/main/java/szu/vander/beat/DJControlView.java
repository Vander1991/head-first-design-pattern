package szu.vander.beat;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public class DJControlView implements ActionListener {

	BaseBeatModel model;
	
	BaseController controller;
	
	JLabel bpmLabel;
	
	JTextField bpmTextField;
	
	JButton setBPMButton;
	
	JButton increaseBPMButton;
	
	JButton decreaseBPMButton;
	
	JMenuBar menuBar;
	
	JMenu menu;
	
	JMenuItem startMenuItem;
	
	JMenuItem stopMenuItem;
	
    JFrame controlFrame;
    
	public DJControlView(BaseController controller, BaseBeatModel model) {
		this.controller = controller;
		this.model = model;
	}
	
	public void createControlView() {
		// 创建Frame，设置大小和位置
		controlFrame = new JFrame("Control");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(300, 100));
        controlFrame.setLocation(-10, 100);
        
        //添加菜单项，Start、Stop、Quit
        menu = new JMenu("menu");
        startMenuItem = new JMenuItem("Start");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.start();
            }
        });
        stopMenuItem = new JMenuItem("Stop");
        menu.add(stopMenuItem); 
        stopMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.stop();
            }
        });
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.exit(0);
            }
        });
        menu.add(quit);
        //将创建好的菜单放入菜单栏，然后将菜单栏加入到Frame中
        menuBar = new JMenuBar();
        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        bpmLabel = new JLabel("Enter BPM:", SwingConstants.LEFT);
        bpmTextField = new JTextField(2);
        setBPMButton = new JButton("Set");
        setBPMButton.setSize(new Dimension(10,40));
        increaseBPMButton = new JButton(">>");
        decreaseBPMButton = new JButton("<<");
        setBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        decreaseBPMButton.addActionListener(this);
 
        JPanel buttonPanel = new JPanel(new GridLayout(1, 2));
 		buttonPanel.add(decreaseBPMButton);
		buttonPanel.add(increaseBPMButton);
        JPanel enterPanel = new JPanel(new GridLayout(1, 3));
        enterPanel.add(bpmLabel);
        enterPanel.add(bpmTextField);
        enterPanel.add(setBPMButton);
        JPanel controlPanel = new JPanel(new GridLayout(2, 1));
        controlPanel.add(enterPanel);
        controlPanel.add(buttonPanel);
        
        bpmLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        controlFrame.getRootPane().setDefaultButton(setBPMButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
        controlFrame.setVisible(true);
	}
	
	public void enableStopMenuItem() {
		stopMenuItem.setEnabled(true);
	}
	
	public void disableStopMenuItem() {
		stopMenuItem.setEnabled(false);
	}
	
	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}
	
	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == setBPMButton) {
			int bpm = Integer.parseInt(bpmTextField.getText());
			controller.setBPM(bpm);
		} else if(event.getSource() == increaseBPMButton) {
			controller.increaseBPM(); 
		} else if(event.getSource() == decreaseBPMButton) {
			controller.decreaseBPM();
		}
	}

}
