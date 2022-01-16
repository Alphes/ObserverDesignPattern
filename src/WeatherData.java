import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable {

    private int temperature;
    private int humidity;
    private int pressure;

    List<Observer> observers = new ArrayList<>();

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public void setMeasurements(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }

    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
}
