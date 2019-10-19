/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern;

import dp.compoundpattern.compoundpattern2.Duck.QuackCounter;
import dp.compoundpattern.compoundpattern2.Duck.Quackable;
import dp.compoundpattern.compoundpattern2.Goose.Goose;
import dp.compoundpattern.compoundpattern2.Goose.GooseAdapter;
import dp.compoundpattern.compoundpattern2.factory.AbstractDuckFactory;
import dp.compoundpattern.compoundpattern2.factory.CountDuckFactory;

/**
 *
 * @author bill
 * 建造一個模擬器，模擬各種鴨子的叫聲。
 * A. QuackCounter: 裝試者模式，用以計算鴨子叫的次數。
 * B. AbstractDuckFactorys: 工廠模式
 */
public class TestCompoundPattern2 {
    public static void main(String[] args) {
        TestCompoundPattern2 simulator = new TestCompoundPattern2();
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
        
        System.out.println("\n鴨子模擬器: 結合工廠模式");
        
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
