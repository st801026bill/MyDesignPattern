/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.observerpattern;

import dp.observerpattern.javaJdk.CurrentConditionsDisplay;
import dp.observerpattern.javaJdk.WeatherDate;

/**
 *
 * @author st801
 * 觀察者模式: 
 * 1. 設計兩個類別，分別繼承: 主題(Observable)、觀察者(Observer)
 * 2. Observable提供 通知觀察者(notifyObservers)方法， 呼叫前記得先執行setChanged();
 * 3. Observer提供 接收資訊(update)方法
 * 
 * 缺點: 因為要繼承Observable、Observer，無法繼承其他類別。
 */
public class TestObserverPatternByJava {
    public static void main(String[] args){
        //Use JavaJdk
         WeatherDate weatherDate = new WeatherDate();
         CurrentConditionsDisplay currentDisplay = new  CurrentConditionsDisplay(weatherDate);
         weatherDate.setMesurements(80, 20, 30.4f);
         weatherDate.setMesurements(82, 70, 29.2f);
         weatherDate.setMesurements(78, 90, 29.2f);
    }
    
}
