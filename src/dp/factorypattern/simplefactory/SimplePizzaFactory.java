/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.simplefactory;

import dp.factorypattern.simplefactory.pizza.PizzaType;
import dp.factorypattern.simplefactory.pizza.VeggiePizza;
import dp.factorypattern.simplefactory.pizza.Pizza;
import dp.factorypattern.simplefactory.pizza.ClamPizza;
import dp.factorypattern.simplefactory.pizza.GreekPizza;
import dp.factorypattern.simplefactory.pizza.PepperoniPizza;
import dp.factorypattern.simplefactory.pizza.CheesePizza;

/**
 *
 * @author st801
 */
public class SimplePizzaFactory {
    public Pizza createPizza(PizzaType type) {
        switch(type){
            case Cheese: 
                return new CheesePizza();
            case Greek: 
                return new GreekPizza();
            case Pepperoni: 
                return new PepperoniPizza();
            case Clam: 
                return new ClamPizza();
            case Veggie: 
                return new VeggiePizza();  
        }
        return null;
    }
}

