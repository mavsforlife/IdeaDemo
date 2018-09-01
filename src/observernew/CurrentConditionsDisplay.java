package observernew;

import oberserlearn.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable mObservable;
    private float mTemperature;
    private float mHumidity;

    public CurrentConditionsDisplay(Observable observable) {
        mObservable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            mTemperature = weatherData.getTemperature();
            mHumidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + mTemperature
        + " F degrees and " + mHumidity + "% humidity");
    }
}
