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
public class Tea extends CaffeineBeverage{
    
    @Override
    protected void brew() {
        System.out.println("用沸水沖泡茶葉");
    }

    @Override
    protected void addCondiments() {
        System.out.println("加檸檬");
    }
    
}
