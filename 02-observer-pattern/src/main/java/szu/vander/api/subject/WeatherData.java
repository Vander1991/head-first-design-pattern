package szu.vander.api.subject;

import java.util.Observable;
import java.util.Observer;

/**
* @author : Vander Choi
* @date : 2018-03-22
* @description :
*/
public class WeatherData extends Observable {
	
	//温度
	private float temperature;
	//湿度
	private float humidity;
	//气压
	private float pressure;
	
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

	public void deleteObserver(Observer o) {
		super.deleteObserver(o);
	}
	
	public void addObserver(Observer o) {
		super.addObserver(o);
	}
	
	public void notifyObserver() {
		super.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}

	public void measurementsChanged() {
		super.setChanged();
		notifyObservers(this);
	}
	
	
}
