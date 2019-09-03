/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern.factory.pizza;

import dp.factorypattern.abstractfactory.pizza.*;
import java.util.ArrayList;

/**
 *
 * @author st801
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList<String> toppings = new ArrayList();
    
    public void prepare() {
        System.out.println("開始準備: "+ name);
        System.out.println("揉麵糰中: "+ dough);
        System.out.println("添加配料: "+ sauce);
        for(String topping : toppings) {
            System.out.println(topping +" ");
        }
    }
    public void bake() {
        System.out.println("烤25分鐘...");
    }
    public void cut() {
        System.out.println("切片中");
    }
    public void box() {
        System.out.println("裝盒中");
    }
    
    public String getName() {
        return name;
    }
}
