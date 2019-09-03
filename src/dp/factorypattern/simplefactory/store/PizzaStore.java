/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.simplefactory.store;

import dp.factorypattern.simplefactory.SimplePizzaFactory;
import dp.factorypattern.simplefactory.pizza.PizzaType;
import dp.factorypattern.simplefactory.pizza.Pizza;

/**
 *
 * @author st801
 */
public class PizzaStore {
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza;
        
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
}
