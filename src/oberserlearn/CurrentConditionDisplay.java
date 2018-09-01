package oberserlearn;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private static final String TAG = "CurrentConditionDisplay";
    private float mTemperature;
    private float mHumidity;
    private WeatherData mWeatherData;

    public CurrentConditionDisplay(WeatherData weatherData) {
        mWeatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println(TAG + ":  " + mTemperature + " F degrees and "
                + mHumidity + " % humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        mTemperature = temp;
        mHumidity = humidity;
        display();
    }
}
