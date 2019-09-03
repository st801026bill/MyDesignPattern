/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.factory.pizza;

/**
 *
 * @author st801
 */
public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name  = "名稱: 紐約風味起士披薩";
        dough = "餅皮: 薄皮";
        sauce = "醬汁: 大蒜番茄醬";
        
        toppings.add("配料: 碎乳酪");
    }
}
