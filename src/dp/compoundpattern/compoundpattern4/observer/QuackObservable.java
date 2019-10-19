/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4.observer;

/**
 *
 * @author bill
 * 建立觀察者介面
 */
public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
