/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern;

import dp.templatemethodpattern.CaffeineBeverage.Coffee;
import dp.templatemethodpattern.CaffeineBeverage.Tea;

/**
 *
 * @author st801
 * 定義樣板模式:
 * 將一個演算法的骨架定義在一個方法中，而演算法本身會用到一些方法，則是定義再次類別中。
 * 樣板方法讓次類別在不改變演算法的情況下，重新定義演算法中的某些步驟。
 */
public class TestTemplateMethodPattern {
    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareRecipe();
        
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
