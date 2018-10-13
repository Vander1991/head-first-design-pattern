package szu.vander.safeproxy.cglib;

import java.util.HashMap;
import java.util.Map;

import net.sf.cglib.proxy.Enhancer;

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
	
	public Object getOwnerProxy(Object obj){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(new OwnerProxy());
        return enhancer.create();
    }
	
	
	public Object getNonOwnerProxy(Object obj){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(obj.getClass());
        enhancer.setCallback(new NonOwnerProxy());
        return enhancer.create();
    }
	
	public void match() {
		Person vander = getPersonByName("Vander");
		Person ownerProxy = (Person)getOwnerProxy(vander);
		System.out.println("Name : " + ownerProxy.getName());
		ownerProxy.setInterests("bowling");
		System.out.println("Interests set from owner proxy");
		try {
			ownerProxy.setHotOrNotRating(10);
		} catch(Exception e) {
			System.out.println("Can not set rating from owner proxy");
		}
		
		Person nonOwnerProxy = (Person)getNonOwnerProxy(vander);
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
