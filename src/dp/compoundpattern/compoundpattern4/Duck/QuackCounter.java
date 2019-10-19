/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4.Duck;

import dp.compoundpattern.compoundpattern4.observer.Observer;

/**
 *
 * @author bill
 * 裝試者模式: QuackCounter
 */
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks = 0;
    
    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }
    
    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }
    
    public static int getQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
}
