/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.statepattern2.state;

import dp.statepattern.statepattern2.CandyMachine;

/**
 *
 * @author bill
 * State:尚未投入硬幣
 */
public class NoQuarterState implements State {
    CandyMachine candyMachine;

    public NoQuarterState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("您投入了25分錢");
        candyMachine.setState(candyMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("您尚未投入了25分錢");
    }

    @Override
    public void turnCrank() {
        System.out.println("轉動開關，但您尚未投入硬幣");
    }

    @Override
    public void dispense() {
        System.out.println("您需要先投幣");
    }
}
