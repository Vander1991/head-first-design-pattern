package szu.vander.safeproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
* @author      : Vander
* @date        : 2018-08-21
* @description ： 
*/
public class OwnerInvocationHandler implements InvocationHandler {

	private BasePerson person;
	
	public OwnerInvocationHandler(BasePerson person) {
		this.person = person;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		if(method.getName().startsWith("get")) {
			return method.invoke(person, args);
		} else if(method.getName().equals("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else if(method.getName().startsWith("set")) {
			return method.invoke(person, args);
		}
		return null;
	}

}
