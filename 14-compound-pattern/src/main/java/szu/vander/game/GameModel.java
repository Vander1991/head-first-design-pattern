package szu.vander.game;

import java.util.ArrayList;
import java.util.Random;

/**
* @author : Vander Choi
* @date : 2018-09-23
* @description :
*/
public class GameModel implements BaseGameModel {

	
	ArrayList<GameObserver> gameObservers = new ArrayList<GameObserver>();
	
	private int max;
	
	private int min;
	
	private int result;
	
	private String tips;
	
	/**
	 * 生成随机数
	 * @return
	 */
	public int getRandomNum() {
		Random rand = new Random();
		int randomNum = rand.nextInt(100);
		return randomNum;
	}
	
	/**
	 * 实现猜测游戏的逻辑
	 * @param number
	 * @param result
	 * @return
	 */
	public void play(int number) {
		if(number >= min && number <= max ) {
			if(number > result) {
				max = number;
			} else if(number < result){
				min = number;
			} else {
				tips = "您猜对啦！";
				updateGame();
				return;
			}
		}
		tips = "请输入" +  min + "-" + max + "的整数";
		updateGame();
	}

	/**
	 * 重新开始游戏需要重置一下范围
	 */
	public void restart() {
		min = 0;
		max = 100;
		tips = "请输入" +  min + "-" + max + "的整数";
		result = getRandomNum();
		updateGame();
	}

	/**
	 * 注册视图观察者
	 */
	public void registerObserver(GameObserver o) {
		gameObservers.add(o);
	}
	
	/**
	 * 当model完成相关逻辑后，更新观察者（视图）的状态
	 */
	public void updateGame() {
		for(GameObserver gameObserver : gameObservers) {
			gameObserver.updateRange(tips);
		}
	}
	
}
