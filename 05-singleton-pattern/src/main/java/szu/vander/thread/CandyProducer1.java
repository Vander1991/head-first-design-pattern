package szu.vander.thread;

import szu.vander.boiler.CandyBoiler1;
import szu.vander.boiler.CandyBoiler2;
import szu.vander.boiler.CandyBoiler3;
import szu.vander.boiler.CandyBoiler4;

/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class CandyProducer1 implements Runnable {

	public void run() {
		System.out.println("_________CandyProducer1 Begin Produce_________");
		CandyBoiler4 instance = CandyBoiler4.getInstance();
		instance.fill();
		instance.boil();
		instance.drain();
	}

}
