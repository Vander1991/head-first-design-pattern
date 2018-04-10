package szu.vander.wrong;

/**
* @author : Vander Choi
* @date : 2018-03-17
* @description :
*/
public class WeatherData{
	
	//温度
	private float temperature;
	//湿度
	private float humidity;
	//气压
	private float pressure;
	
	private CurrentConditionDisplayer currentConditionDisplayer;
	
	private ForecastDisplayer forecastDisplayer;
	
	private StatisticDisplayer statisticDisplayer;
	
	public CurrentConditionDisplayer getCurrentConditionDisplayer() {
		return currentConditionDisplayer;
	}

	public void setCurrentConditionDisplayer(CurrentConditionDisplayer currentConditionDisplayer) {
		this.currentConditionDisplayer = currentConditionDisplayer;
	}

	public ForecastDisplayer getForecastDisplayer() {
		return forecastDisplayer;
	}

	public void setForecastDisplayer(ForecastDisplayer forecastDisplayer) {
		this.forecastDisplayer = forecastDisplayer;
	}

	public StatisticDisplayer getStatisticDisplayer() {
		return statisticDisplayer;
	}

	public void setStatisticDisplayer(StatisticDisplayer statisticDisplayer) {
		this.statisticDisplayer = statisticDisplayer;
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
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.humidity = humidity;
		this.temperature = temperature;
		this.pressure = pressure;
		measurementsChanged();
	}
	
	public void measurementsChanged() {
		currentConditionDisplayer.update(temperature, humidity, pressure);
		forecastDisplayer.update(temperature, humidity, pressure);
		statisticDisplayer.update(temperature, humidity, pressure);
	}
	
}
