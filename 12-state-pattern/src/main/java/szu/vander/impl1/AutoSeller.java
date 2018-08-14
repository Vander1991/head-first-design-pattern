package szu.vander.impl1;
/**
* @author      : Vander
* @date        : 2018-08-08
* @description ： 
*/
public class AutoSeller {

	private final static int SOLD_OUT = 0;
	
	private final static int NO_TEN_YUAN = 1;
	
	private final static int HAS_TEN_YUAN = 2;
	
	private final static int SOLD = 3;
	
	int state = SOLD_OUT;
	
	int count = 0;

	public AutoSeller(int count) {
		this.count = count;
		if(count > 0) {
			state = NO_TEN_YUAN;
		}
	}
	
	public void insertTenYuan() {
		if(state == SOLD_OUT) {
			System.out.println("The machine is sold out, please push refund button!");
		} else if(state == NO_TEN_YUAN) {
			state = HAS_TEN_YUAN;
			System.out.println("You insert ten yuan!");
		} else if(state == HAS_TEN_YUAN) {
			System.out.println("The machine has ten yuan, don't repeat doing it");
		} else if(state == SOLD) {
			System.out.println("Please wait， we're already giving you a cup of judge");
		}
	}
	
	public void ejectTenYuan() {
		if(state == SOLD_OUT) {
			System.out.println("You can't eject, you haven't insert ten yuan");
		} else if(state == NO_TEN_YUAN) {
			System.out.println("You haven't insert ten yuan");
		} else if(state == HAS_TEN_YUAN) {
			System.out.println("Ten yuan returned");
			state = NO_TEN_YUAN;
		} else if(state == SOLD) {
			System.out.println("Sorry, you already press the sell button");
		}
	}
	
	public void pressSellButton() {
		if(state == SOLD_OUT) {
			System.out.println("You press the sell button, but there is no judge");
		} else if(state == NO_TEN_YUAN) {
			System.out.println("You press the sell button, you haven't insert ten yuan");
		} else if(state == HAS_TEN_YUAN) {
			System.out.println("You press the sell button, give you the judge");
			state = SOLD;
		} else if(state == SOLD) {
			System.out.println("Sorry, you already press the sell button");
		}
	}
	
	public void dispense() {
		if(state == SOLD_OUT) {
			System.out.println("System error, No judge dispense");
		} else if(state == NO_TEN_YUAN) {
			System.out.println("System error, No judge dispense");
		} else if(state == HAS_TEN_YUAN) {
			System.out.println("System error, No judge dispense");
		} else if(state == SOLD) {
			System.out.println("We're giving the judge");
			count--;
			if(count == 0) {
				System.out.println("The judge has sold out");
				state = SOLD_OUT;
			} else {
				state = NO_TEN_YUAN;
			}
		}
	}
	
}
