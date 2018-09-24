package szu.vander.game;
/**
* @author : Vander Choi
* @date : 2018-09-23
* @description :
*/
public class GameController implements BaseGameController {

	BaseGameModel model;
	
	GameView view;
	
	public GameController(BaseGameModel model) {
		this.model = model;
		view = new GameView(model, this);
		view.createControlView();
		view.enableStartMenuItem();
	}
	
	public void start() {
		view.disableStartMenuItem();
		model.restart();
	}

	public void play(int number) {
		model.play(number);
	}

}
