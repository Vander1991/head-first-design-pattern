package szu.vander.mvc;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public class DJStatusView implements BeatObserver, BPMObserver {

	BaseBeatModel model;
	
	BaseController controller;
	
	JFrame viewFrame;
	
	BeatBar beatBar;
	
	JLabel bpmOutputLabel;

	public DJStatusView(BaseController controller, BaseBeatModel model) {
		this.controller = controller;
		this.model = model;
		model.registerObserver((BeatObserver)this);
		model.registerObserver((BPMObserver)this);
	}
	
    public void createView() {
        viewFrame = new JFrame("View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(300,100);
        viewFrame.setLocation(-10, 0);
        
        //创建状态显示label和节拍条
        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);
		beatBar = new BeatBar();
		beatBar.setValue(50);
		
		//创建两行一列的panel，将两个控件放进去
		JPanel viewPanel = new JPanel(new GridLayout(2, 1));
        viewPanel.add(beatBar);
        viewPanel.add(bpmOutputLabel);
		
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        //根据控件大小显示视图大小
//        viewFrame.pack();
        
        viewFrame.setVisible(true);
	}
	
	public void updateBPM() {
		int bpm = model.getBPM();
		if(bpm == 0) {
			bpmOutputLabel.setText("offline");
		} else {
			bpmOutputLabel.setText("Current BPM : " + model.getBPM());
		}
	}
	
	public void updateBeat() {
		beatBar.setValue(100);
	}
	
}
