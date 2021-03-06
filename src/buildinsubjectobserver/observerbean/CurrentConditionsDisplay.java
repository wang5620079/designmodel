package buildinsubjectobserver.observerbean;


import buildinsubjectobserver.displayment.DisplayElements;
import buildinsubjectobserver.observablebean.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer,DisplayElements{
    public float temperature;
    public float humidity;
    public float presser;
    Observable observable;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay temperature="+temperature+" humidity="+humidity+" presser"+presser);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;
            this.temperature=weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.presser=weatherData.getPresser();
            display();
        }

    }
}
