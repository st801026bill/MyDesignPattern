/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern2.factory;

import dp.compoundpattern.compoundpattern2.Duck.Quackable;

/**
 *
 * @author bill
 */
public abstract class AbstractDuckFactory {
    public abstract Quackable createMallardDuck();
    public abstract Quackable createRedhedDuck();
    public abstract Quackable createDuckCall();
    public abstract Quackable createRubberDuck();
}
