package szu.vander.beverage3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author      : caiwj
 * @date        : 2018-07-12
 * @description ：
 *
 */
public class Coffee extends Beverage {

	@Override
	public void brew() {
		System.out.println("Dripping Coffee throught filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding sugar and milk");
	}
	
	public boolean customCondiments() {
		String answer = getUserInput();
		if(answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}
	
	private String getUserInput() {
		String answer = null;
		System.out.println("would you like some milk and sugar with your coffee (y/n)? ");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = bufferedReader.readLine();
		} catch (IOException e) {
			System.err.println("IO error trying to read your answer");
		}
		if(answer == null) {
			return "no";
		}
		return answer;
	}
	
}