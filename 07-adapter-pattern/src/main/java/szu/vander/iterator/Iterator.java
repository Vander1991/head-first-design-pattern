package szu.vander.iterator;
/**
* @author : Vander Choi
* @date : 2018-07-05
* @description :
*/
public interface Iterator<E> {

	public boolean hasNext();
	
	E next();
	
	E remove();
	
}
