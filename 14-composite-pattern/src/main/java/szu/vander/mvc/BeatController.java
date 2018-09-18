package szu.vander.mvc;
/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public class BeatController implements BaseController {

	BaseBeatModel model;
	
	DJStatusView statusView;
	
	DJControlView controlView;
	
	public BeatController(BaseBeatModel model) {
		this.model = model;
		
		//创建状态显示视图（显示BPM和节拍）
		statusView = new DJStatusView(this, model);
		statusView.createView();
		//创建控制视图，控制BPM和节拍
		controlView = new DJControlView(this, model);
		controlView.createControlView();
		controlView.disableStopMenuItem();
		controlView.enableStartMenuItem();
		model.initialize();
	}

	public void start() {
		model.on();
		controlView.disableStartMenuItem();
		controlView.enableStopMenuItem();
	}

	public void stop() {
		model.off();
		controlView.disableStopMenuItem();
		controlView.enableStartMenuItem();
	}

	public void setBPM(int bpm) {
		model.setBPM(bpm);
	}

	public void increaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm + 1);
	}

	public void decreaseBPM() {
		int bpm = model.getBPM();
		model.setBPM(bpm - 1);
	}

}
