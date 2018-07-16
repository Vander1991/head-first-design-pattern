package szu.vander.wrong;
/**
* @author      : caiwj
* @date        : 2018-07-10
* @description ： 
*/
public class House2 {

	WeatherStation station;
	
	public float getTemp() {
		Thermometer thermometer = station.getThermometer();
		return getTempHelper(thermometer);
	}

	private float getTempHelper(Thermometer thermometer) {
		return thermometer.getTemperature();
	}
	
}
