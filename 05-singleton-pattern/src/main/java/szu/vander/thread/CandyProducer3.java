package szu.vander.thread;

import szu.vander.boiler.CandyBoiler1;

/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class CandyProducer3 implements Runnable {

	public void run() {
		System.out.println("_________CandyProducer3 Begin Produce_________");
		CandyBoiler1 instance = CandyBoiler1.getInstance();
		instance.fill();
		instance.boil();
		instance.drain();
	}

}
