package szu.vander.duck;
/**
* @author      : Vander
* @date        : 2018-09-03
* @description ： 
*/
public class DuckSimulator {

	public static void main(String args[]) {
		DuckSimulator duckSimulator = new DuckSimulator();
		AbstractDuckFactory countingDuckFactory = new CountingDuckFactory();
		duckSimulator.simulate(countingDuckFactory);
	}
	
	void simulate(AbstractDuckFactory abstractDuckFactory) {
		Quackable mallardDuck = abstractDuckFactory.createMallardDuck();
		Quackable redheadDuck = abstractDuckFactory.createRedheadDuck();
		Quackable rubberDuck = abstractDuckFactory.createRubberDuck();
		Quackable duckCall = abstractDuckFactory.createDuckCall();
		Goose goose = new Goose();
		Quackable gooseAdapter = new GooseAdapter(goose);
		
		DuckFlock duckFlock = new DuckFlock();
		duckFlock.add(mallardDuck);
		duckFlock.add(redheadDuck);
		duckFlock.add(rubberDuck);
		duckFlock.add(duckCall);
		duckFlock.add(gooseAdapter);
		
		System.out.println("\nDuck Simulator");
		
		simulate(duckFlock);
		
		System.out.println("The ducks quacked " + QuackCounter.quackNum + " times");
		
	}
	
	void simulate(Quackable duck) {
		duck.quack();
	}
}
