package szu.vander.restaurant;
/**
* @author : Vander Choi
* @date : 2018-06-17
* @description :
*/
public class OrderFactory {

	public static Order createOrder(String type) {
		if(type.equals("fish")) {
			return new SteakOrder();
		}
		return null;
	}
	
}
