/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.statepattern1.state;

import dp.statepattern.statepattern1.CandyMachine;

/**
 *
 * @author bill
 */
public class SoldState implements State {
    CandyMachine candyMachine;

    public SoldState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("請稍候, 我們將給您一顆糖果...");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("無法退幣，您已經轉動轉軸");
    }

    @Override
    public void turnCrank() {
        System.out.println("轉動2次也不會得到2顆糖果拉!");
        //candyMachine.setState(candyMachine);
    }

    @Override
    public void dispense() {
        candyMachine.releaseBall();
        if(candyMachine.getCount() > 0)
            candyMachine.setState(candyMachine.getNoQuarterState());
        else {
            System.out.println("糖果沒了，無法提供糖果!");
            candyMachine.setState(candyMachine.getSoldOutState());
        }
        
    }
}
