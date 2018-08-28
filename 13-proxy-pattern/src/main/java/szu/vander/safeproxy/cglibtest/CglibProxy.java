package szu.vander.safeproxy.cglibtest;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {

	@SuppressWarnings("rawtypes")
	public Object getInstance(Object obj, Class[] args,Object[] argsValue){
    	
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(this);
        return enhancer.create(args,argsValue);
        
    }
	
	public Object getInstance(Object target){
    	
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
        
    }
	
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

		System.err.println("——————调用真实对象前");
		Object result = methodProxy.invokeSuper(obj, args);
		System.err.println("——————调用真实对象后");
		return result;
		
	}

}
