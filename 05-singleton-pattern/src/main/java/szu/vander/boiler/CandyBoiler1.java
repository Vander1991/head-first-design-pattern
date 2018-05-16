package szu.vander.boiler;
/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class CandyBoiler1 {

	private boolean empty;
	
	private boolean boiled;
	
	private static CandyBoiler1 candyBoiler1;
	
	private CandyBoiler1() {
		System.out.println("_______________new CandyBoiler1()____________");
		empty = true;
		boiled = false;
	}

	public static CandyBoiler1 getInstance() {
		if(candyBoiler1 == null) {
			candyBoiler1 = new CandyBoiler1();
		}
		return candyBoiler1;
	}
	
	public void fill() {
		if(isEmpty()) {
			System.out.println("___________fill material___________");
			empty = false;
			boiled = false;
		}
	}
	
	public void boil() {
		if((!isBoiled()) && (!isEmpty())) {
			System.out.println("___________boil material___________");
			empty = false;
			boiled = true;
		}
	}
	
	public void drain() {
		if((isBoiled()) && (!isEmpty())) {
			System.out.println("___________drain material___________");
			//将糖浆倒出后恢复原状态
			empty = true;
			boiled = false;
		}
	}
	
	public void makeCandy() {
		fill();
		boil();
		drain();
	}
	
	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
	
}
