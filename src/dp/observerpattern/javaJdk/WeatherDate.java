/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.javaJdk;

import dp.observerpattern.custom.observer.Observer;
import dp.observerpattern.custom.subject.Subject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author st801
 */
public class WeatherDate extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherDate() { }
    
    private void measurementsChanged() {
        setChanged();
        notifyObservers();
    }
    
    public void setMesurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
    
    
}
