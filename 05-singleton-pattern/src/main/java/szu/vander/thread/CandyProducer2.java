package szu.vander.thread;

import szu.vander.boiler.CandyBoiler1;

/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class CandyProducer2 implements Runnable {

	public void run() {
		System.out.println("_________CandyProducer2 Begin Produce_________");
		CandyBoiler1 instance = CandyBoiler1.getInstance();
		instance.fill();
		instance.boil();
		instance.drain();
	}

}
