package szu.vander.mine.main;

import szu.vander.mine.observer.CurrentConditionDisplayer;
import szu.vander.mine.observer.ForecastDisplayer;
import szu.vander.mine.subject.WeatherData;

/**
* @author : Vander Choi
* @date : 2018-03-17
* @description :
*/
public class Main {

	public static void main(String args[]) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplayer currentConditionDisplayer = new CurrentConditionDisplayer(weatherData);
		ForecastDisplayer forecastDisplayer = new ForecastDisplayer(weatherData);
		weatherData.setMeasurements(100, 200, 300);
	}
	
}
