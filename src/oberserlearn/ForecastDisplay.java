package oberserlearn;

public class ForecastDisplay implements Observer, DisplayElement{

    private float mCurrentPressure = 29.2f;
    private float mLastPressure;
    private WeatherData mWeatherData;

    public ForecastDisplay(WeatherData weatherData) {
        mWeatherData = weatherData;
        mWeatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.print("Forecast: ");
        if (mCurrentPressure > mLastPressure) {
            System.out.println("Improving weather on the way!");
        } else if (mCurrentPressure == mLastPressure) {
            System.out.println("More of the same");
        } else if (mCurrentPressure < mLastPressure) {
            System.out.println("Watch out for cooler, rainy weather");
        }
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        mLastPressure = mCurrentPressure;
        mCurrentPressure = pressure;

        display();
    }
}
