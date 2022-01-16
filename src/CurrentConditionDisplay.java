import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherData data = (WeatherData) o;
        System.out.println(" temperature = " + data.getTemperature() +
                            " humidity = " + data.getHumidity() +
                            " pressure = " + data.getPressure());
    }
}
