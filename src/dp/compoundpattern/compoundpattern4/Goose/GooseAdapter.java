/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4.Goose;

import dp.compoundpattern.compoundpattern4.Duck.Quackable;
import dp.compoundpattern.compoundpattern4.observer.Observable;
import dp.compoundpattern.compoundpattern4.observer.Observer;

/**
 *
 * @author bill
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;
    
    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }
    
    @Override
    public void quack() {
        goose.honk();
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
        return "GooseAdapter";
    }
}
