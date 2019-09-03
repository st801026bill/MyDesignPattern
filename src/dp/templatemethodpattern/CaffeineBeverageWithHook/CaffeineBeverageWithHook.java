/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.CaffeineBeverageWithHook;

import dp.templatemethodpattern.CaffeineBeverage.*;

/**
 *
 * @author st801
 */
public abstract class CaffeineBeverageWithHook {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        
        //定義一個掛勾(Hook)
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }
    
    abstract protected void brew();
    abstract protected void addCondiments();
    
    private void boilWater() {
        System.out.println("煮沸水");
    }
    
    private void pourInCup() {
        System.out.println("倒進杯子");
    }
    
    /**
     * 掛勾(Hook):
     * 定義一個空的方法，預設回傳為true
     * 由次類別來決定是否要時作此方法，來控制使否要加調味料。
     **/
    public boolean customerWantsCondiments() {
        return true;
    }
}
