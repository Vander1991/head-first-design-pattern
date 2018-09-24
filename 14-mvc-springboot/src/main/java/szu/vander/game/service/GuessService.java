package szu.vander.game.service;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

/**
* @author      : caiwj
* @date        : 2018-08-03
* @description ： 
*/
@Service
public class GuessService {

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
	public String getTips(int number, HttpSession session) {
		String tips = "";
		int result = (int) session.getAttribute("result");
		int min = (int) session.getAttribute("min");
		int max = (int) session.getAttribute("max");
		if(number >= min && number <= max ) {
			if(number > result) {
				max = number;
			} else if(number < result){
				min = number;
			} else {
				tips = "您猜对啦！";
				return tips;
			}
		}
		session.setAttribute("min", min);
		session.setAttribute("max", max);
		tips = "请输入" +  min + "-" + max + "的整数";
		return tips;
	}

	/**
	 * 重新开始游戏需要重置一下范围
	 */
	public String start(HttpSession session) {
		String tips = "";
		int min = 0;
		int max = 100;
		session.setAttribute("min", min);
		session.setAttribute("max", max);
		tips = "请输入" +  min + "-" + max + "的整数";
		return tips;
	}
	
}
