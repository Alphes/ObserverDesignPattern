public class WeatherStation {
    public static void main(String[] args) {

        WeatherData data = new WeatherData();

        data.addObserver(new CurrentConditionDisplay());
        data.addObserver(new ForecastDisplay());
        data.addObserver(new StatisticsDisplay());

        System.out.println("Sending weather data: ");
        data.setMeasurements(20,40,52);
        System.out.println("Sending weather Data");
        data.setMeasurements(25,50, 895);
        System.out.println("Sending weather Data");
        data.setMeasurements(23,55, 900);
    }
}
