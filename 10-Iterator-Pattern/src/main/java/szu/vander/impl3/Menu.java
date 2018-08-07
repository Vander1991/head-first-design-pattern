package szu.vander.impl3;

import java.util.Iterator;
/**
* @author      : Vander Choi
* @date        : 2018-07-26
* @description ： 
*/
public interface Menu<T> {

	/**
	 * 创建迭代器
	 * @return
	 */
	Iterator<T> createIterator();
	
}
