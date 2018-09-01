package observernew;



public class WeatherStationNew {

    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionDisplay = new CurrentConditionsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(80f, 65f, 30.4f);
        weatherData.setMeasurements(82f, 70f, 29.2f);
        weatherData.setMeasurements(78f, 90f, 29.2f);
    }
}
