/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern;

import dp.compoundpattern.compoundpattern4.Duck.QuackCounter;
import dp.compoundpattern.compoundpattern4.Duck.Quackable;
import dp.compoundpattern.compoundpattern4.Goose.Goose;
import dp.compoundpattern.compoundpattern4.Goose.GooseAdapter;
import dp.compoundpattern.compoundpattern4.factory.AbstractDuckFactory;
import dp.compoundpattern.compoundpattern4.factory.CountDuckFactory;
import dp.compoundpattern.compoundpattern4.Flock;
import dp.compoundpattern.compoundpattern4.observer.Quackologist;

/**
 *
 * @author bill
 * 建造一個模擬器，模擬各種鴨子的叫聲。
 * A. QuackCounter: 裝試者模式，用以計算鴨子叫的次數。
 * B. AbstractDuckFactorys: 工廠模式
 * C. Flock: 反覆器模式
 * D: Observer: 觀察者模式
 */
public class TestCompoundPattern4 {
    public static void main(String[] args) {
        TestCompoundPattern4 simulator = new TestCompoundPattern4();
        AbstractDuckFactory duckFactory = new CountDuckFactory();   //B:建立鴨子工廠，並傳入simulate()當作參數
        
        simulator.simulate(duckFactory);
    }
    
    //B:利用AbstractDuckFactory間接建立鴨子，而非直接實體化鴨子
    private void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck   = duckFactory.createMallardDuck();
        Quackable redheadDuck   = duckFactory.createRedhedDuck();
        Quackable duckCall      = duckFactory.createDuckCall();
        Quackable rubberDuck    = duckFactory.createRubberDuck();
        Quackable gooseDuck     = new GooseAdapter(new Goose());    //亂入鴨群的鵝
        
        //建立
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        
        Flock flockOfMallards = new Flock();
        Quackable mallard1 = duckFactory.createMallardDuck();
        Quackable mallard2 = duckFactory.createMallardDuck();
        Quackable mallard3 = duckFactory.createMallardDuck();
        Quackable mallard4 = duckFactory.createMallardDuck();
        
        flockOfMallards.add(mallard1);
        flockOfMallards.add(mallard2);
        flockOfMallards.add(mallard3);
        flockOfMallards.add(mallard4);
        flockOfDucks.add(flockOfMallards);

        //D:透過觀察者模式監控是否有鴨子叫
        System.out.println("\n鴨子模擬器: 結合觀察者模式");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        
        System.out.println("\n一整群鴨...");
        simulate(flockOfDucks);
        
        System.out.println("鴨子總共叫了:"+ QuackCounter.getQuacks()+ "次");
        
    }
    
    public void simulate(Quackable duck) {
        duck.quack();
    }
}
