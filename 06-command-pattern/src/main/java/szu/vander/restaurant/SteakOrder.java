package szu.vander.restaurant;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class SteakOrder implements Order {

	private Cooker cooker;
	
	public SteakOrder() {
		cooker = new Cooker();
	}
	
	public void orderUp() {
		cooker.cookSteak();
	}

}
