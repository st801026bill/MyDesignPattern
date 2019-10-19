/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern;

import dp.compoundpattern.compoundpattern1.Duck.DuckCall;
import dp.compoundpattern.compoundpattern1.Duck.MallardDuck;
import dp.compoundpattern.compoundpattern1.Duck.QuackCounter;
import dp.compoundpattern.compoundpattern1.Duck.Quackable;
import dp.compoundpattern.compoundpattern1.Duck.RedheadDuck;
import dp.compoundpattern.compoundpattern1.Duck.RubberDuck;
import dp.compoundpattern.compoundpattern1.Goose.Goose;
import dp.compoundpattern.compoundpattern1.Goose.GooseAdapter;

/**
 *
 * @author bill
 * 建造一個模擬器，模擬各種鴨子的叫聲。
 * A.QuackCounter: 裝試者模式，用以計算鴨子叫的次數。
 */
public class TestCompoundPattern1 {
    public static void main(String[] args) {
        TestCompoundPattern1 simulator = new TestCompoundPattern1();
        simulator.simulate();
    }
    
    private void simulate() {
        //A: 利用QuackCounter計算呼叫的次數
        Quackable mallardDuck   = new QuackCounter(new MallardDuck());
        Quackable redheadDuck   = new QuackCounter(new RedheadDuck());
        Quackable duckCall      = new QuackCounter(new DuckCall());
        Quackable rubberDuck    = new QuackCounter(new RubberDuck());
        Quackable gooseDuck     = new GooseAdapter(new Goose());    //亂入鴨群的鵝
        
        System.out.println("\n鴨子模擬器: 結合裝試者模式");
        
        simulate(mallardDuck);
        simulate(redheadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);    //鵝模擬成鴨叫
        System.out.println("鴨子總共叫了:"+ QuackCounter.getQuacks()+ "次");
        
    }
    
    public void simulate(Quackable duck) {
        duck.quack();
    }
}
