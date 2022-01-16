import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        WeatherData data = (WeatherData) o;
        System.out.println("Avg temperature = " + data.getTemperature()
                + " Avg humidity = " + data.getHumidity()+
                " Avg pressure = " + data.getPressure());
    }
}
