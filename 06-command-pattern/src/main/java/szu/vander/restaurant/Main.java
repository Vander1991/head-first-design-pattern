package szu.vander.restaurant;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description : 真正做菜的厨师和接收订单的人的解耦,实际上跟Spring的思想很类似，
* 				 被注入的对象，并不知道啥时候它才要干活。
*/
public class Main {
	
	public static void main(String[] args) {
		Order order = OrderFactory.createOrder("fish");
		Waiter waiter = new Waiter();
		waiter.takeOrder(order);
		waiter.orderUp();
	}
	
}
