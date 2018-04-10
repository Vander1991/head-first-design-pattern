package szu.vander.mine.subject;

import java.util.ArrayList;

import szu.vander.mine.observer.Observer;

/**
* @author : Vander Choi
* @date : 2018-03-17
* @description :
*/
public class WeatherData implements Subjecter{
	
	//观察者列表
	private static ArrayList<Observer> observerList;
	//温度
	private float temperature;
	//湿度
	private float humidity;
	//气压
	private float pressure;
	
	public WeatherData() {
		observerList = new ArrayList<Observer>();
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

	public void registerObserver(Observer observer) {
		observerList.add(observer);
	}
	
	public void removeObserver(Observer observer) {
		int index = observerList.indexOf(observer);
		if(index != -1) {
			observerList.remove(index);
		}
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void publishMsg() {
		for(Observer observer : observerList) {
			observer.update(getTemperature(), getHumidity(), getPressure());
		}
	}
	
	public void measurementsChanged() {
		publishMsg();
	}
	
}
