/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern;

import dp.factorypattern.abstractfactory.pizza.Pizza;
import dp.factorypattern.abstractfactory.pizza.PizzaType;
import dp.factorypattern.abstractfactory.store.NYPizzaStore;
import dp.factorypattern.abstractfactory.store.PizzaStore;

/**
 *
 * @author st801
 * 
 */
public class TestFactoryPatternByAbsFactory {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        
        Pizza pizza;
        pizza = nyStore.orderPizza(PizzaType.Cheese);
        System.out.println("小明點了"+ pizza.getName());
        System.out.println("----");
        pizza = nyStore.orderPizza(PizzaType.Clam);
        System.out.println("小華點了"+ pizza.getName());
    }
}
