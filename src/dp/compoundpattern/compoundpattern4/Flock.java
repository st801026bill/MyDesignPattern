/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4;

import dp.compoundpattern.compoundpattern4.Duck.Quackable;
import dp.compoundpattern.compoundpattern4.observer.Observer;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bill
 */
public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    
    @Override
    public void quack() {
        Iterator iterator =  quackers.iterator();
        while(iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
    
    @Override
    public void registerObserver(Observer observer) {
        Iterator iterator = quackers.iterator();
        while(iterator.hasNext()) {
            Quackable duck = (Quackable)iterator.next();
            duck.registerObserver(observer);    //一一走訪 Flock 內每個 Quackable 物件並做註冊
        }
    }
    
    @Override
    public void notifyObservers() {}
}
