/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern;

import dp.factorypattern.simplefactory.store.PizzaStore;
import dp.factorypattern.simplefactory.pizza.PizzaType;
import dp.factorypattern.simplefactory.SimplePizzaFactory;

/**
 *
 * @author st801
 * 簡單工廠模式: 將實體化物件(new)的方法抽出，設計一個工廠類別專門處理物件的實體化
 */
public class TestFactoryPatternBySimple {
    public static void main(String[] args) {
        PizzaStore store = new PizzaStore(new SimplePizzaFactory());
        store.orderPizza(PizzaType.Cheese);
    }
}
