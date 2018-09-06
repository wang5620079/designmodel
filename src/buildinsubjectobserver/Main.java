package buildinsubjectobserver;

import buildinsubjectobserver.observerbean.CurrentConditionsDisplay;
import buildinsubjectobserver.observablebean.WeatherData;
import buildinsubjectobserver.observerbean.GeneralDisplay;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();

        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay c1 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay c2 = new CurrentConditionsDisplay(weatherData);
        CurrentConditionsDisplay c3 = new CurrentConditionsDisplay(weatherData);
        GeneralDisplay d1 = new GeneralDisplay(weatherData);
        GeneralDisplay d2 = new GeneralDisplay(weatherData);
        GeneralDisplay d3 = new GeneralDisplay(weatherData);
        weatherData.setMeasurements(r.nextFloat(),r.nextFloat(),r.nextFloat());


        c1.update(weatherData,null);
        c2.update(weatherData,null);
        c3.update(weatherData,null);
        d1.update(weatherData,null);
        d2.update(weatherData,null);
        d3.update(weatherData,null);

    }
}
