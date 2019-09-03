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
public class ForecastDisplay implements Observer, DisplayElement{
    private float tmperature;
    private float humidity;
    private Subject weatherDate;

    public ForecastDisplay(Subject weatherDate) {
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
        if(humidity >= 80f)
            System.out.println("天氣預測 : 全台有雨");
        if(humidity < 80f && humidity >= 30f)
            System.out.println("天氣預測 : 晴時多雲偶陣雨");
        if(humidity <30f)
            System.out.println("天氣預測 : 晴天");
    }
}
