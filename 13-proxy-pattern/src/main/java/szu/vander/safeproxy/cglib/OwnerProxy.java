package szu.vander.safeproxy.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
* @author      : Vander
* @date        : 2018-08-21
* @description ： 
*/
public class OwnerProxy implements MethodInterceptor {

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		if(method.getName().startsWith("get")) {
			return proxy.invokeSuper(obj, args);
		} else if(method.getName().equals("setHotOrNotRating")) {
			throw new IllegalAccessException();
		} else if(method.getName().startsWith("set")) {
			return proxy.invokeSuper(obj, args);
		}
		return null;
	}

}