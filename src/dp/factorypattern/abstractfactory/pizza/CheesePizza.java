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
public class CheesePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    
    public CheesePizza(PizzaIngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }
    
    @Override
    public void prepare() {
        System.out.println("準備中..."+ name);
        //ingredient = factory.createIngredient();
        //ingredient: 把"Pizza"的實體變數，設定為CheesePizza指定的某種原料。
        //factory: 原料工廠，"Pizza"不在乎使用甚麼工廠，只要是原料工廠即可。
        //createIngredient: 會回傳這個區域使用的原料，取決於factory是紐約或是芝加哥。
        
        dough = ingredientFactory.createDough();    //麵團
        sauce = ingredientFactory.createSauce();    //醬
        cheese = ingredientFactory.createCheese();  //起士
    }
}
