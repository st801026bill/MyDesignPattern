/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.abstractfactory.pizza;

import dp.factorypattern.abstractfactory.ingredient.factory.PizzaIngredientFactory;

/**
 *
 * @author st801
 */
public class ClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    
    public ClamPizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("準備中..."+ name);
        dough = ingredientFactory.createDough();    //麵團
        sauce = ingredientFactory.createSauce();    //醬
        cheese = ingredientFactory.createCheese();  //起士
        clam = ingredientFactory.createClam();    //蛤蜊
    }
    
}
