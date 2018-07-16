package szu.vander.restaurant;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class Waiter {

	private Order order;
	
	public void takeOrder(Order order) {
		this.order = order;
	}
	
	public void orderUp() {
		if(this.order != null) {
			order.orderUp();
		}
	}
	
}
