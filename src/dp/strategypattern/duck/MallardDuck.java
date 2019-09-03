/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.duck;

import dp.strategypattern.behavior.quack.Quack;
import dp.strategypattern.behavior.fly.FlyWithWings;

/**
 *
 * @author st801
 */
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println("I am MallardDuck");
    }
}

