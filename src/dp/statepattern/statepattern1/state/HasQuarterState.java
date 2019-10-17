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
 * State:已投入硬幣
 */
public class HasQuarterState implements State {
    CandyMachine candyMachine;

    public HasQuarterState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("您無法再投入硬幣");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("已退幣");
        candyMachine.setState(candyMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("轉動中...");
        candyMachine.setState(candyMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("無法發放糖果");
    }
}
