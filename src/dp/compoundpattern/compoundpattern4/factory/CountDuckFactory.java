/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern4.factory;

import dp.compoundpattern.compoundpattern4.Duck.DuckCall;
import dp.compoundpattern.compoundpattern4.Duck.MallardDuck;
import dp.compoundpattern.compoundpattern4.Duck.QuackCounter;
import dp.compoundpattern.compoundpattern4.Duck.Quackable;
import dp.compoundpattern.compoundpattern4.Duck.RedheadDuck;
import dp.compoundpattern.compoundpattern4.Duck.RubberDuck;

/**
 *
 * @author bill
 */
public class CountDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedhedDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new DuckCall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }
    
}
