/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.abstractfactory.ingredient.factory;

import dp.factorypattern.abstractfactory.ingredient.cheese.Cheese;
import dp.factorypattern.abstractfactory.ingredient.clam.Clam;
import dp.factorypattern.abstractfactory.ingredient.dough.Dough;
import dp.factorypattern.abstractfactory.ingredient.pepperoni.Pepperoni;
import dp.factorypattern.abstractfactory.ingredient.sauce.Sauce;
import dp.factorypattern.abstractfactory.ingredient.veggies.Veggies;


/**
 *
 * @author st801
 */
public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clam createClam();
}
