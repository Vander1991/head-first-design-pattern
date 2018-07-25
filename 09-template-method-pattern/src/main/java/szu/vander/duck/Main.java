package szu.vander.duck;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Duck[] ducks = {
			new Duck("duck10", 10),
			new Duck("duck7", 7),
			new Duck("duck3", 3),
			new Duck("duck1", 1),
			new Duck("duck8", 8),
			new Duck("duck5", 5)
		};
		Arrays.sort(ducks);
		for(int i=0; i<ducks.length; i++) {
			System.out.println(ducks[i].getName());
		}
	}

}
