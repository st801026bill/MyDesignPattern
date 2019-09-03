/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.simplefactory.pizza;

/**
 *
 * @author st801
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name  = "名稱: 素食披薩";
        dough = "餅皮: 薄皮";
        sauce = "醬汁: 大蒜醬";        
        toppings.add("配料: 碎乳酪");
    }
}
