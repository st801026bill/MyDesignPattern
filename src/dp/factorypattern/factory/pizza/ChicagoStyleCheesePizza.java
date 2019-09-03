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
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza() {
        name  = "名稱: 芝加哥風味起士披薩";
        dough = "餅皮: 厚皮";
        sauce = "醬汁: 小番茄醬";
        
        toppings.add("配料: 義大利白乾酪");
    }
}
