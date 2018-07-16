package szu.vander.iterator;
/**
* @author : Vander Choi
 * @param <E>
* @date : 2018-07-05
* @description :
*/
public class EnumeratorIterator<E> implements Iterator<E> {

	private Enumeration<E> enumer;
	
	public boolean hasNext() {
		return enumer.hasNext();
	}

	public E next() {
		return enumer.next();
	}

	public E remove() {
		throw new UnsupportedOperationException();
	}

}
