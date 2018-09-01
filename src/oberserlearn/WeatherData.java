package oberserlearn;

import java.util.ArrayList;

public class WeatherData implements Subject{

    private ArrayList<Observer> mObservers = new ArrayList<>();

    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    private float getTemperature() {
        return mTemperature;
    }

    private float getHumidity() {
        return mHumidity;
    }

    private float getPressure() {
        return mPressure;
    }

    private void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void unRegisterObserver(Observer observer) {
        if (observer == null) {
            return;
        }
        int i = mObservers.indexOf(observer);
        if (i > 0) {
            mObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(mTemperature, mHumidity, mPressure);
        }
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        measurementsChanged();
    }
}
