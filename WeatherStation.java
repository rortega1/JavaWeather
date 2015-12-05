import java.util.ArrayList;
import java.io.*;
import java.util.List;

public class WeatherStation {
	
	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		// StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
// 		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		
		List<Float> a = new ArrayList<Float>();
		
		for (int i = 0; i < args.length; i++) {
			
			a.add(Float.parseFloat(args[i].trim()));
		}
	
		weatherData.setMeasurements(a.get(0), a.get(1), a.get(2));
	}
}