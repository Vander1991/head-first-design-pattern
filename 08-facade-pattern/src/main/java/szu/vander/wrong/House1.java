package szu.vander.wrong;
/**
* @author      : caiwj
* @date        : 2018-07-10
* @description ： 
*/
public class House1 {

	WeatherStation station;
	
	public float getTemp() {
		return station.getThermometer().getTemperature();
	}
	
}
