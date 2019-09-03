/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.factory.store;

import dp.factorypattern.factory.pizza.NYStyleCheesePizza;
import dp.factorypattern.factory.pizza.Pizza;
import dp.factorypattern.factory.pizza.PizzaType;
import static dp.factorypattern.factory.pizza.PizzaType.Cheese;

/**
 *
 * @author st801
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch(type) {
            case Cheese:
                return new NYStyleCheesePizza();
        }
        return null;
    }
}
