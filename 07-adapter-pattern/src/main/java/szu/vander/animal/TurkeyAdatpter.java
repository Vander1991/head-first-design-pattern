package szu.vander.animal;
/**
* @author : Vander Choi
* @date : 2018-07-04
* @description :
*/
public class TurkeyAdatpter implements Duck {

	private Turkey turkey;
	
	public TurkeyAdatpter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	public void quack() {
		turkey.gobble();
	}

	public void fly() {
		for(int i=0; i<5; i++) {
			turkey.fly();
		}
	}
	
}
