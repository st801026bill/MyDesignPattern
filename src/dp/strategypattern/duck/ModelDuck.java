/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.duck;

import dp.strategypattern.behavior.quack.Quack;
import dp.strategypattern.behavior.fly.FlyNoWay;

/**
 *
 * @author st801
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
        System.out.println("I am ModelDuck");
    }
}
