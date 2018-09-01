package observernew;

import oberserlearn.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private float mCurrentPressure = 29.2f;
    private float mLastPressure;
    private Observable mObservable;

    public ForecastDisplay(Observable observable) {
        mObservable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            mLastPressure = mCurrentPressure;
            mCurrentPressure = weatherData.getPressure();

            display();
        }
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
}
