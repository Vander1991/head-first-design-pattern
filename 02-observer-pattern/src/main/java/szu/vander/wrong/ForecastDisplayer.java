package szu.vander.wrong;

/**
* @author : Vander Choi
* @date : 2018-03-17
* @description :
*/
public class ForecastDisplayer implements Displayer, Updater{

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

	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	}

	public void display() {
		System.out.println("temperature = " + this.temperature);
		System.out.println("humidity = " + this.humidity);
		System.out.println("pressure = " + this.pressure);
	}
}
