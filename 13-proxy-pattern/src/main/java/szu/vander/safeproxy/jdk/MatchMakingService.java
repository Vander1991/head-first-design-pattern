package szu.vander.safeproxy.jdk;

import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.Map;

/**
* @author      : Vander
* @date        : 2018-08-21
* @description ： 
*/
public class MatchMakingService {

	private Map<String, Person> personRepository;
	
	public MatchMakingService() {
		initRepository();
	}
	
	public void initRepository() {
		personRepository = new HashMap<String, Person>();
		personRepository.put("Vander", new Person("Vander", "Boy", "Table Tennis"));
		personRepository.put("Panda", new Person("Panda", "Girl", "Football"));
		personRepository.put("Linda", new Person("Linda", "Girl", "Basketball"));
		personRepository.put("Lily", new Person("Lily", "Girl", "Basketball"));
		personRepository.put("Vincent", new Person("Vincent", "Boy", "Baseball"));
	}
	
	public BasePerson getOwnerProxy(BasePerson person) {
		return (BasePerson)Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new OwnerInvocationHandler(person));
	}
	
	public BasePerson getNonOwnerProxy(BasePerson person) {
		return (BasePerson)Proxy.newProxyInstance(
				person.getClass().getClassLoader(), 
				person.getClass().getInterfaces(), 
				new NonOwnerInvocationHandler(person));
	}
	
	public void match() {
		BasePerson vander = getPersonByName("Vander");
		BasePerson ownerProxy = getOwnerProxy(vander);
		System.out.println("Name : " + ownerProxy.getName());
		ownerProxy.setInterests("bowling");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch(Exception e) {
			System.out.println("Can not set rating from owner proxy");
		}
		
		BasePerson nonOwnerProxy = getNonOwnerProxy(vander);
		System.out.println("Name : " + nonOwnerProxy.getName());
		
		try {
			nonOwnerProxy.setInterests("badminton");
		} catch(Exception e) {
			System.out.println("Cannot set interests from non ownner proxy");
		}
		nonOwnerProxy.setHotOrNotRating(2);
		System.out.println("Rating set from non owner proxy");
		System.out.println("Rating is " + nonOwnerProxy.getRating());
	}
	
	public Person getPersonByName(String name) {
		return personRepository.get(name);
	}
	
}
