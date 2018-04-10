package szu.vander.mine.subject;

import szu.vander.mine.observer.Observer;

/**
* @author : Vander Choi
* @date : 2018-03-17
* @description :
*/
public interface Subjecter {
	
	/**
	 * 注册观察者
	 */
	public void registerObserver(Observer observer);
	/**
	 * 移除观察者
	 */
	public void removeObserver(Observer observer);
	/**
	 * 发布新消息
	 */
	public void publishMsg();
	
}
