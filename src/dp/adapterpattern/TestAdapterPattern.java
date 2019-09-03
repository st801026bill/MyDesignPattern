/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern;

/**
 *
 * @author st801
 */
public class TestAdapterPattern {
    public static void main(String[] args) {
        
        MallardDuck duck = new MallardDuck();
        
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        
        System.out.println("火雞...");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("鴨子...");
        duck.quack();
        duck.fly();
        
        System.out.println("火雞轉接器...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
