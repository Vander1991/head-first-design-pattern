package szu.vander.animal;
/**
* @author : Vander Choi
* @date : 2018-07-04
* @description :
*/
public class Main {

	public static void main(String[] args) {
		Turkey turkey = new WildTurkey();
		Duck duck = new TurkeyAdatpter(turkey);
		duck.quack();
		duck.fly();
	}

}
