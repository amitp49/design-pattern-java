/**
 * 
 */
package Observer;

import java.util.ArrayList;

/**
 * @author ampatel
 *
 */
public class WeatherData implements Subject{

	private Boolean changed;
	public ArrayList observers;
	
	private float temperature;
	private float humidity;
	private float pressure;
	
	/**
	 * 
	 */
	public WeatherData() {
		// TODO Auto-generated constructor stub
		observers =  new ArrayList();
		changed = false;
	}


	public WeatherData(float t, float h, float p) {
		// TODO Auto-generated constructor stub
		this.temperature = t;
		this.humidity = h;
		this.pressure = p;
	}


	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}


	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		int i = observers.indexOf(o);
		if(i>=0)
		{
			observers.remove(i);
		}
	}


	public void notifyObservers(Object args) {
		// TODO Auto-generated method stub
		if(changed)
		{
			for (int i = 0; i < observers.size(); i++) {
				Observer observer = (Observer) observers.get(i);
				observer.update(this, args);
			}	
			setChanged(false);
		}
	}
	
	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		//WeatherData we = new WeatherData(1.0f,2.0f,3.0f); //create some data model
		//notifyObservers(we);
		notifyObservers(null);
	}
	
	public void measurementsChanged()
	{
		setChanged();
		notifyObservers();
	}


	/**
	 * @param temperature the temperature to set
	 */
	public void setTemperature(float temperature) {
		this.temperature = temperature;
		measurementsChanged();
	}


	/**
	 * @param humidity the humidity to set
	 */
	public void setHumidity(float humidity) {
		this.humidity = humidity;
		measurementsChanged();
	}


	/**
	 * @param pressure the pressure to set
	 */
	public void setPressure(float pressure) {
		this.pressure = pressure;
		measurementsChanged();
	}


	/**
	 * @return the temperature
	 */
	public float getTemperature() {
		return temperature;
	}


	/**
	 * @return the humidity
	 */
	public float getHumidity() {
		return humidity;
	}


	/**
	 * @return the pressure
	 */
	public float getPressure() {
		return pressure;
	}


	/**
	 * @param changed the changed to set
	 */
	public void setChanged(Boolean changed) {
		this.changed = changed;
	}
	
	public void setChanged() {
		setChanged(true);
	}
	
}
