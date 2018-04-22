/**
 * 
 */
package Observer;

/**
 * @author ampatel
 *
 */
public class WeatherStation {

	/**
	 * 
	 */
	public WeatherStation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setTemperature(5);
		weatherData.setTemperature(15);
		weatherData.setHumidity(10);
	}

}
