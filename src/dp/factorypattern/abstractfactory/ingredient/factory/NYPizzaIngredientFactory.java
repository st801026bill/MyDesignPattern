/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.abstractfactory.ingredient.factory;

import dp.factorypattern.abstractfactory.ingredient.cheese.Cheese;
import dp.factorypattern.abstractfactory.ingredient.cheese.ReggianoCheese;
import dp.factorypattern.abstractfactory.ingredient.clam.Clam;
import dp.factorypattern.abstractfactory.ingredient.clam.FreshClam;
import dp.factorypattern.abstractfactory.ingredient.dough.Dough;
import dp.factorypattern.abstractfactory.ingredient.dough.ThinCrustDough;
import dp.factorypattern.abstractfactory.ingredient.pepperoni.Pepperoni;
import dp.factorypattern.abstractfactory.ingredient.pepperoni.SlicedPepperoni;
import dp.factorypattern.abstractfactory.ingredient.sauce.MarinaraSauce;
import dp.factorypattern.abstractfactory.ingredient.sauce.Sauce;
import dp.factorypattern.abstractfactory.ingredient.veggies.Garlic;
import dp.factorypattern.abstractfactory.ingredient.veggies.Mushroom;
import dp.factorypattern.abstractfactory.ingredient.veggies.Onion;
import dp.factorypattern.abstractfactory.ingredient.veggies.RedPepper;
import dp.factorypattern.abstractfactory.ingredient.veggies.Veggies;

/**
 *
 * @author st801
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Dough createDough() {
        return new ThinCrustDough();//薄皮
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce(); //義大利西紅柿醬
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese(); //帕馬森乾酪
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies[] veggieses = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()}; //大蒜, 洋蔥, 蘑菇, 辣椒
        return veggieses;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();   //切片意大利辣香腸
    }

    @Override
    public Clam createClam() {
        return new FreshClam(); //鮮蛤蜊
    }
    
}
