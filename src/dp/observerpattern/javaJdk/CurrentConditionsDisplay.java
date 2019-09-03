/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.javaJdk;

import dp.observerpattern.custom.subject.Subject;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author st801
 */
public class CurrentConditionsDisplay implements Observer{
    Observable observable;
    private float tmperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherDate) {
            WeatherDate weatherDate = (WeatherDate) o;
            this.tmperature = weatherDate.getTemperature();
            this.humidity = weatherDate.getHumidity();
            display();
        }
    }

    public void display() {
        System.out.println(String.format("目前狀況: 氣溫%.2f度，濕度%.2f%%", this.tmperature, this.humidity));
    }
}
