import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherData data = (WeatherData) o;
        System.out.println("forecast temperature = " + data.getTemperature() +
                " forecast humidity = " + data.getHumidity() +
                " forecast pressure = " + data.getPressure());
    }
}
