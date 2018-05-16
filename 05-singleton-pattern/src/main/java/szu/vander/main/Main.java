package szu.vander.main;

import szu.vander.thread.CandyProducer1;
import szu.vander.thread.CandyProducer2;
import szu.vander.thread.CandyProducer3;

/**
* @author : Vander Choi
* @date : 2018-05-02
* @description :
*/
public class Main {

	public static void main(String[] args) {
		CandyProducer1 pro1 = new CandyProducer1();
		Thread thread1 = new Thread(pro1);
		Thread thread2 = new Thread(pro1);
		Thread thread3 = new Thread(pro1);
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
