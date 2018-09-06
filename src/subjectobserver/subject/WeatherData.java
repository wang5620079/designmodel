package subjectobserver.subject;

import subjectobserver.observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    public ArrayList<Observer> observers;
    public float temperature;
    public float humidity;
    public float presser;

    public WeatherData() {
        this.observers=new ArrayList<>();
    }

    @Override
    public void registerobserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeobserver(Observer o) {
        if (!observers.isEmpty()&&observers.contains(o)){
            observers.remove(o);
        }
    }

    @Override
    public void notifyobserver() {
        for(Observer o :observers){
            o.update(temperature,humidity,presser);
        }
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public void setHumidity(float humidity) {
        this.humidity = humidity;
    }

    public float getPresser() {
        return presser;
    }

    public void setPresser(float presser) {
        this.presser = presser;
    }

    public void datachanged(){
        notifyobserver();
    }
    public void setMeasurement(float temperature,float humidity,float presser){
        this.temperature=temperature;
        this.humidity=humidity;
        this.presser=presser;
        datachanged();
    }
}
