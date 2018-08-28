package szu.vander.safeproxy.cglibtest;

public class Main {

	public static void main(String[] args) {
		CglibProxy proxy = new CglibProxy();
		HelloWorldImpl hellworldImpl1 = (HelloWorldImpl) proxy.getInstance(new HelloWorldImpl("Vander"),
				new Class[] { String.class }, new Object[] { "Panda" });
		hellworldImpl1.sayHello("你好");
	}

}
