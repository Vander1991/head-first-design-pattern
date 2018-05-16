package szu.vander.boiler;
/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class CandyBoiler2 {

	private boolean empty;
	
	private boolean boiled;
	
	private static CandyBoiler2 candyBoiler2;
	
	private CandyBoiler2() {
		System.out.println("_______________CandyBoiler Constructor____________");
		empty = true;
		boiled = false;
	}

	public static synchronized CandyBoiler2 getInstance() {
		if(candyBoiler2 == null) {
			candyBoiler2 = new CandyBoiler2(); 
		}
		return candyBoiler2;
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

