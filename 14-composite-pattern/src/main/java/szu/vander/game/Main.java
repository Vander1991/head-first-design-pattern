package szu.vander.game;
/**
* @author : Vander Choi
* @date : 2018-09-16
* @description :
*/
public class Main {

	public static void main(String args[]) {
		BaseGameModel model = new GameModel();
		BaseGameController gameController = new GameController(model);
	}
	
}
