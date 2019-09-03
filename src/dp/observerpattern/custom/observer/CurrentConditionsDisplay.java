/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern.custom.observer;

import dp.observerpattern.custom.subject.Subject;

/**
 *
 * @author st801
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float tmperature;
    private float humidity;
    private Subject weatherDate;

    public CurrentConditionsDisplay(Subject weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update(float tmperature, float humidity, float pressure) {
        this.tmperature = tmperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println(String.format("目前狀況: 氣溫%.2f度，濕度%.2f%%", this.tmperature, this.humidity));
    }
}
