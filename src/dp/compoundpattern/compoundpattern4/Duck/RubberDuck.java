/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4.Duck;

import dp.compoundpattern.compoundpattern4.observer.Observable;
import dp.compoundpattern.compoundpattern4.observer.Observer;

/**
 *
 * @author bill
 */
public class RubberDuck implements Quackable {
    Observable observable;
    
    public RubberDuck() {
        observable = new Observable(this);
    }
    
    @Override
    public void quack() {
        System.out.println("吱吱叫");
        notifyObservers();  //當呱呱叫時需要讓觀察者知道
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
    
    @Override
    public String toString() {
        return "RubberDuck";
    }
}
