package subjectobserver.observer;

import subjectobserver.displayment.DisplayElements;
import subjectobserver.subject.Subject;

public class CurrentConditionsDisplay implements Observer,DisplayElements{
    public float temperature;
    public float humidity;
    public float presser;
    public Subject weatherdata;

    public CurrentConditionsDisplay(Subject subject) {
        this.weatherdata=subject;
        subject.registerobserver(this);
    }

    @Override
    public void display() {
        System.out.println("temperature="+temperature+" humidity="+humidity+" presser"+presser);

    }

    @Override
    public void update(float temperature,float humidity,float presser) {
        this.temperature=temperature;
        this.humidity=humidity;
        this.presser=presser;
        display();
    }
}
