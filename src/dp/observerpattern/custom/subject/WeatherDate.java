/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.custom.subject;

import dp.observerpattern.custom.observer.Observer;
import dp.observerpattern.custom.subject.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author st801
 */
public class WeatherDate implements Subject {
    private List<Observer> observer;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() {
        observer = new ArrayList<Observer>();
    }
    
    @Override
    public void registerObserver(Observer o) {
        observer.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observer.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observer) {
            o.update(temperature, humidity, pressure);
        }
    }
    
    private void measurementsChanged() {
        notifyObservers();
        System.out.println();
    }
    
    public void setMesurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
