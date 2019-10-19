/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern2.factory;

import dp.compoundpattern.compoundpattern2.Duck.DuckCall;
import dp.compoundpattern.compoundpattern2.Duck.MallardDuck;
import dp.compoundpattern.compoundpattern2.Duck.Quackable;
import dp.compoundpattern.compoundpattern2.Duck.RedheadDuck;
import dp.compoundpattern.compoundpattern2.Duck.RubberDuck;

/**
 *
 * @author bill
 */
public class DuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedhedDuck() {
        return new RedheadDuck();
    }

    @Override
    public Quackable createDuckCall() {
        return new DuckCall();
    }

    @Override
    public Quackable createRubberDuck() {
        return new RubberDuck();
    }
    
}
