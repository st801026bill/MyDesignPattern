/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.strategypattern;

import dp.strategypattern.behavior.fly.FlyRocketPowered;
import dp.strategypattern.duck.Duck;
import dp.strategypattern.duck.MallardDuck;
import dp.strategypattern.duck.ModelDuck;

/**
 *
 * @author st801
 * 
 * StrategyPattern(策略模式)
 */
public class TestStrategyPattern {
    public static void main(String[] args) {
        //野鴨
        System.out.println("****野鴨****");
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
        
        //模型鴨
        System.out.println("****模型鴨****");
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
