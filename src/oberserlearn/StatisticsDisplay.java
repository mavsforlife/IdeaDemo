package oberserlearn;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float mMaxTemp = 200.0f;
    private float mMInTemp = 0.0f;
    private float mTempSum = 0.0f;

    private int mNumReadings = 0;

    private WeatherData mWeatherData;

    public StatisticsDisplay(WeatherData weatherData) {
        mWeatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        mTempSum += temp;
        mNumReadings++;

        if (temp > mMaxTemp) {
            mMaxTemp = temp;
        }

        if (temp < mMInTemp) {
            mMInTemp = temp;
        }

        display();
    }

    @Override
    public void display() {
        System.out.println("Avg/Max/Min temperature = " + (mTempSum / mNumReadings)
                + "/" + mMaxTemp + "/" + mMInTemp);
    }
}
