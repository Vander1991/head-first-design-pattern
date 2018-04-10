package szu.vander.api;

import szu.vander.api.observer.CurrentConditionDisplayer;
import szu.vander.api.subject.WeatherData;

/**
* @author : Vander Choi
* @date : 2018-03-22
* @description :
*/
public class Main {
	
	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplayer currentConditionDisplayer = new CurrentConditionDisplayer(weatherData);
		weatherData.setMeasurements(100, 200, 300);
	}
	
}
