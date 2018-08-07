package szu.vander.impl1;
/**
* @author : Vander Choi
* @date : 2018-07-25
* @description :
*/
public class MenuItem {

	private String name;
	
	private String desc;
	
	private double price;

	public MenuItem(String name, String desc, double price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
}
