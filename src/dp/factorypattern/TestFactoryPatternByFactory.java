/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.factorypattern;

import dp.factorypattern.factory.pizza.Pizza;
import dp.factorypattern.factory.pizza.PizzaType;
import dp.factorypattern.factory.store.ChicagoPizzaStore;
import dp.factorypattern.factory.store.NYPizzaStore;
import dp.factorypattern.factory.store.PizzaStore;

/**
 *
 * @author st801
 * 1. 建立一個抽象類別PizzaStore
 * 2. PizzaStore有orderPizza()及abstract createPizza()
 * 3. orderPizza()會呼叫由不同子類別實作的createPizza()以具象Pizza，藉此達到FactoryPattern的目的
 * 
 * 備註: 將可能會時常修改的邏輯抽出並寫在子類別，商業邏輯定義在一個不常動的抽象類別內
 * A. 變數不可持有具象類別的參考: 如果使用new，就會持有具項類別的參考，改用工廠避開這樣的做法 。
 * B. 不要讓類別繼承自具象別: 如果繼承自具象類別，就會依賴具象類別，請繼承自一個介面或抽象類別。
 * C. 不要讓刺類別中的方法override父類別的方法: 如果override一個父類別的方法，那這個父類別就不是一個適合被繼承的類別； 父類別中所實踐的方法，應由所有子類別共享。
 */
public class TestFactoryPatternByFactory {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();
        
        Pizza pizza;
        pizza = nyStore.orderPizza(PizzaType.Cheese);
        System.out.println("小明點了"+ pizza.getName());
        System.out.println("----");
        pizza = chicagoStore.orderPizza(PizzaType.Cheese);
        System.out.println("小華點了"+ pizza.getName());
    }
}
