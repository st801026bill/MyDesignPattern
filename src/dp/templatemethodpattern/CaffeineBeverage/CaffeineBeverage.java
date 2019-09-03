/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.CaffeineBeverage;

/**
 *
 * @author st801
 */
public abstract class CaffeineBeverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    abstract protected void brew();
    abstract protected void addCondiments();
    
    private void boilWater() {
        System.out.println("煮沸水");
    }
    
    private void pourInCup() {
        System.out.println("倒進杯子");
    }
}
