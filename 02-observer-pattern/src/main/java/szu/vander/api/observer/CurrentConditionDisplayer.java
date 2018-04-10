package szu.vander.api.observer;

import java.util.Observable;
import java.util.Observer;

import szu.vander.api.subject.WeatherData;

/**
* @author : Vander Choi
* @date : 2018-03-22
* @description :
*/
public class CurrentConditionDisplayer implements Displayer, Observer {

	//温度
	private float temperature;
	//湿度
	private float humidity;
	//气压
	private float pressure;
	
	public CurrentConditionDisplayer(Observable observable) {
		observable.addObserver(this);
	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}

	public void display() {
		System.out.println("temperature = " + this.temperature);
		System.out.println("humidity = " + this.humidity);
		System.out.println("pressure = " + this.pressure);
	}

	public void update(Observable o, Object arg) {
		WeatherData weatherData = (WeatherData) arg;
		this.humidity = weatherData.getHumidity();
		this.temperature = weatherData.getTemperature();
		this.pressure = weatherData.getPressure();
		display();
	}

}
