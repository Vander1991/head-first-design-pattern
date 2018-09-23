package szu.vander.beat;
/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public interface BaseBeatModel {

	void initialize();
	
	void on();
	
	void off();
	
	void setBPM(int bpm);
	
	int getBPM();
	
	void registerObserver(BeatObserver o);
	
	void registerObserver(BPMObserver o);
	
	void removeObserver(BeatObserver o);
	
	void removeObserver(BPMObserver o);
	
}
