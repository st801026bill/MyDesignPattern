/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.factory.store;

import dp.factorypattern.factory.pizza.Pizza;
import dp.factorypattern.factory.pizza.PizzaType;

/**
 *
 * @author st801
 */
public abstract class PizzaStore {
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        pizza = createPizza(type);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    //工廠方法: 藉由abstart讓子類別實作自己的工廠方法
    protected abstract Pizza createPizza(PizzaType type);
}
