/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4.Duck;

import dp.compoundpattern.compoundpattern4.observer.QuackObservable;

/**
 *
 * @author bill
 */
public interface Quackable extends QuackObservable{
    public void quack();
}
