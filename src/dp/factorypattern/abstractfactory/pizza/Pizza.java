/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.abstractfactory.pizza;

import dp.factorypattern.abstractfactory.ingredient.cheese.Cheese;
import dp.factorypattern.abstractfactory.ingredient.clam.Clam;
import dp.factorypattern.abstractfactory.ingredient.dough.Dough;
import dp.factorypattern.abstractfactory.ingredient.pepperoni.Pepperoni;
import dp.factorypattern.abstractfactory.ingredient.sauce.Sauce;
import dp.factorypattern.abstractfactory.ingredient.veggies.Veggies;
import java.util.ArrayList;

/**
 *
 * @author st801
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clam clam;
    
    public abstract void prepare();
    
    public void bake() {
        System.out.println("烤25分鐘...");
    }
    public void cut() {
        System.out.println("切片中");
    }
    public void box() {
        System.out.println("裝盒中");
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public String toString() {
        return "";
    }
}
