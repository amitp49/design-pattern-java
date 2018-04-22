/**
 * 
 */
package Observer;


/**
 * @author ampatel
 *
 */
public class CurrentConditionDisplay implements Observer, DisplayElement{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	/**
	 * 
	 */
	public CurrentConditionDisplay() {
		// TODO Auto-generated constructor stub
	}

	public CurrentConditionDisplay(Subject subject) {
		// TODO Auto-generated constructor stub
		this.weatherData = subject;
		this.weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("temp : " + this.temperature );
		System.out.println("humi : " + this.humidity );
	}

	@Override
	public void update(Subject s, Object args) {
		if(s instanceof WeatherData)
		{
			WeatherData weatherData = (WeatherData) s;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			
			// TODO Auto-generated method stub
			display();
		}
	}
}
