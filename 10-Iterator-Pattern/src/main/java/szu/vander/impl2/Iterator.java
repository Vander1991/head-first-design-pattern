package szu.vander.impl2;

public interface Iterator<T> {

	/**
	 * 判断集合是否有下一项
	 * @return
	 */
	boolean hasNext();
	
	/**
	 * 获取集合的下一项
	 * @return
	 */
	T next();
	
}
