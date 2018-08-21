package szu.vander.impl4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author      : Vander
* @date        : 2018-08-21
* @description ： 
*/
public class NonOwnerInvocationHandler implements InvocationHandler {

	private BasePerson person;
	
	public NonOwnerInvocationHandler(BasePerson person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().equals("setHotOrNotRating")) {
			method.invoke(person, args);
		} else if(method.getName().startsWith("set")) {
			throw new IllegalAccessException();
		} else if(method.getName().startsWith("get")) {
			method.invoke(person, args);
		}
		return null;
	}

	
	
}
