package szu.vander.safeproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
* @author      : Vander
* @date        : 2018-08-28
* @description ： 
*/
public class NonOwnerProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if(method.getName().equals("setHotOrNotRating")) {
			return method.invoke(obj, args);
		} else if(method.getName().startsWith("set")) {
			throw new IllegalAccessException();
		} else if(method.getName().startsWith("get")) {
			return method.invoke(obj, args);
		}
		return null;
	}

}
