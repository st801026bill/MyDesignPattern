/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern;


import dp.observerpattern.custom.observer.CurrentConditionsDisplay;
import dp.observerpattern.custom.observer.ForecastDisplay;
import dp.observerpattern.custom.observer.StatisticsDisplay;
import dp.observerpattern.custom.subject.WeatherDate;

/**
 *
 * @author st801
 * 觀察者模式: 
 * 1. 設計兩個介面: 主題(Subject)、觀察者(Observer)
 * 2. Subject提供 註冊(registerObserver), 取消註冊(removeObserver), 通知觀察者(notifyObservers)方法
 * 3. Observer提供 接收資訊(update)方法
 */
public class TestObserverPatternByCustom {
    public static void main(String[] args){
        //Use custom
        WeatherDate weatherDate = new WeatherDate();
        //訂閱 WeatherDate
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDate);
        StatisticsDisplay statisticsDisplay     = new StatisticsDisplay(weatherDate);
        ForecastDisplay forecastDisplay         = new ForecastDisplay(weatherDate);
        
        weatherDate.setMesurements(80, 20, 30.4f);
        weatherDate.setMesurements(82, 70, 29.2f);
        weatherDate.setMesurements(78, 90, 29.2f);
        //取消訂閱
        weatherDate.removeObserver(currentDisplay);
        weatherDate.setMesurements(78, 90, 29.2f);
    }
    
}
