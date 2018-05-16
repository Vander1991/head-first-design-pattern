package szu.vander.boiler;
/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class CandyBoiler4 {

	private boolean empty;
	
	private boolean boiled;
	
	private volatile static CandyBoiler4 candyBoiler4;
	
	private CandyBoiler4() {
		System.out.println("_______________new CandyBoiler()____________");
		empty = true;
		boiled = false;
	}

	public static CandyBoiler4 getInstance() {
		if(candyBoiler4 == null) {
			synchronized (CandyBoiler4.class) {
				if(candyBoiler4 == null) {
					candyBoiler4 = new CandyBoiler4();	
				}
			}
		}
		return candyBoiler4;
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

