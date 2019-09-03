/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern.duck;

import dp.strategypattern.behavior.quack.QuackBehavior;
import dp.strategypattern.behavior.fly.FlyBehavior;

/**
 *
 * @author st801
 */
public abstract class Duck {
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;
    
    public Duck() {}
    public abstract void display();
    public void performFly() {
        flyBehavior.fly();
    }
    public void performQuack() {
        quackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }
    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
    public void swim() {
        System.out.println("Duck: 所有的鴨子都會游泳");
    }
}
