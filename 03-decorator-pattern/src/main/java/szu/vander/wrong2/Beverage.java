package szu.vander.wrong2;
/**
* @author : Vander Choi
* @date : 2018-04-15
* @description :
*/
public class Beverage {

	private String desc;
	
	private boolean milk;
	
	private boolean soy;
	
	private boolean mocha;
	
	private boolean whip;

	public boolean hasMilk() {
		return this.milk;
	}
	
	public boolean hasSoy() {
		return this.soy;
	}
	
	public boolean hasMocha() {
		return this.mocha;
	}
	
	public boolean hasWhip() {
		return this.whip;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}

	public float cost() {
		float flavourCost = 0.0f;
		if(hasMilk()) {
			flavourCost = flavourCost + 1.0f;
		} 
		if(hasSoy()) {
			flavourCost = flavourCost + 2.0f;
		}
		if(hasMocha()) {
			flavourCost = flavourCost + 3.0f;
		}
		if(hasWhip()) {
			flavourCost = flavourCost + 4.0f;
		}
		return flavourCost;
	}
	
}
