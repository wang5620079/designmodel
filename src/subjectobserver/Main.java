package subjectobserver;

import subjectobserver.observer.CurrentConditionsDisplay;
import subjectobserver.subject.WeatherData;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay c1= new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay c2 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay c3 = new CurrentConditionsDisplay(weatherData);


        weatherData.setMeasurement(r.nextFloat(),r.nextFloat(),r.nextFloat());
        weatherData.setMeasurement(r.nextFloat(),r.nextFloat(),r.nextFloat());
        weatherData.setMeasurement(r.nextFloat(),r.nextFloat(),r.nextFloat());
    }
}
