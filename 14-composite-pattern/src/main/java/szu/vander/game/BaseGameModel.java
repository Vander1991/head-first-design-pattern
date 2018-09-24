package szu.vander.game;

/**
* @author : Vander Choi
* @date : 2018-09-23
* @description :
*/
public interface BaseGameModel {
	
	void play(int number);
	
	void restart();
	
	void registerObserver(GameObserver o);

}
