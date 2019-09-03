/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.abstractfactory.store;

import dp.factorypattern.abstractfactory.ingredient.factory.NYPizzaIngredientFactory;
import dp.factorypattern.abstractfactory.ingredient.factory.PizzaIngredientFactory;
import dp.factorypattern.abstractfactory.pizza.CheesePizza;
import dp.factorypattern.abstractfactory.pizza.ClamPizza;
import dp.factorypattern.abstractfactory.pizza.Pizza;
import dp.factorypattern.abstractfactory.pizza.PizzaType;



/**
 *
 * @author st801
 */
public class NYPizzaStore extends PizzaStore{
    Pizza pizza = null;
    PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
    
    @Override
    protected Pizza createPizza(PizzaType type) {
        switch(type) {
            case Cheese:
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("紐約風味起士披薩");
                break;
            case Clam:
                pizza = new  ClamPizza(ingredientFactory);
                pizza.setName("紐約風味蛤蜊披薩");
                break;
        }
        return pizza;
    }
}
