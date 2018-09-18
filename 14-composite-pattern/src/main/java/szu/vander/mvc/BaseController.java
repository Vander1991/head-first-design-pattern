package szu.vander.mvc;
/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public interface BaseController {

	void start();
	
	void stop();
	
	void setBPM(int bpm);

	void increaseBPM();

	void decreaseBPM();

}
