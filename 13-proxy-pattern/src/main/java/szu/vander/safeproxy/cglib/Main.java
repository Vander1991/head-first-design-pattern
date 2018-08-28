package szu.vander.safeproxy.cglib;

import szu.vander.safeproxy.jdk.MatchMakingService;

public class Main {

	public static void main(String[] args) {
//		CglibProxy proxy = new CglibProxy();
//		HelloWorldImpl hellworldImpl1 = (HelloWorldImpl) proxy.getInstance(new HelloWorldImpl("Vander"),
//				new Class[] { String.class }, new Object[] { "Panda" });
//		// hellworldImpl.sayHello("你好");
//		// HelloWorldImpl hellworldImpl1 = (HelloWorldImpl)
//		// proxy.getInstance(hellworldImpl);
//		hellworldImpl1.sayHello("你好");
		MatchMakingService matchMakingService = new MatchMakingService();
		matchMakingService.match();
	}

}
