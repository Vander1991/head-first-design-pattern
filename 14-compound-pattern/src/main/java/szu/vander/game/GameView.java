package szu.vander.game;

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
* @date : 2018-09-23
* @description :
*/
public class GameView implements GameObserver, ActionListener {

	JFrame controlFrame;
	
	JMenu menu;
	
	JMenuItem startMenuItem;
	
	BaseGameModel model;
	
	BaseGameController controller;
	
	JMenuBar menuBar;
	
	JLabel gameTipsLabel;
	
	JTextField gameNumberTextField;
	
	JButton playButton;
	
	JButton restartButton;
	
	public GameView(BaseGameModel model, BaseGameController controller) {
		super();
		this.model = model;
		this.controller = controller;
		model.registerObserver((GameObserver)this);
	}

	public void createControlView() {
		// 创建Frame，设置大小和位置
		controlFrame = new JFrame("猜数字游戏");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(400, 200));
        controlFrame.setLocation(500, 500);
        
        //添加菜单项，Start、Stop、Quit
        menu = new JMenu("菜单");
        startMenuItem = new JMenuItem("开始游戏");
        menu.add(startMenuItem);
        startMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                controller.start();
            }
        });
        JMenuItem quit = new JMenuItem("退出游戏");
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
        
        gameTipsLabel = new JLabel("请输入1-100的整数", SwingConstants.LEFT);
        gameNumberTextField = new JTextField(2);
        playButton = new JButton("Play");
        playButton.setSize(new Dimension(10,40));
        playButton.addActionListener(this);
        
        restartButton = new JButton("Restart");
        restartButton.setSize(new Dimension(10,40));
        restartButton.addActionListener(this);
        
        JPanel labelPanel = new JPanel(new GridLayout(1, 1)); 
        labelPanel.add(gameTipsLabel);
        JPanel playPanel = new JPanel(new GridLayout(1, 3));
        playPanel.add(gameNumberTextField);
        playPanel.add(playButton);
        playPanel.add(restartButton);
        JPanel controlPanel = new JPanel(new GridLayout(2, 1));
        controlPanel.add(labelPanel);
        controlPanel.add(playPanel);
        
        gameTipsLabel.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        controlFrame.getRootPane().setDefaultButton(playButton);
        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
        controlFrame.setVisible(true);
        
	}
	
	public void disableStartMenuItem() {
		startMenuItem.setEnabled(false);
	}
	
	public void enableStartMenuItem() {
		startMenuItem.setEnabled(true);
	}
	
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == playButton) {
			int number = Integer.parseInt(gameNumberTextField.getText());
			controller.play(number);
		} else if(event.getSource() == restartButton) {
			controller.start();
		}
	}
	
	public void updateRange(String tips) {
		gameTipsLabel.setText(tips);
	}

}
