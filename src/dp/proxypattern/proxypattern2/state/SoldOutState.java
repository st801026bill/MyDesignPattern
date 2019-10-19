/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern.proxypattern2.state;

import dp.proxypattern.proxypattern2.CandyMachine;

/**
 *
 * @author bill
 */
public class SoldOutState implements State {
    CandyMachine candyMachine;

    public SoldOutState(CandyMachine candyMachine) {
        this.candyMachine = candyMachine;
    }
    
    @Override
    public void insertQuarter() {
        System.out.println("糖果已經賣完，無法投入硬幣");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("無法退幣，您尚未投入硬幣");
        //candyMachine.setState(candyMachine);
    }

    @Override
    public void turnCrank() {
        System.out.println("糖果已經賣完...");
        //candyMachine.setState(candyMachine);
    }

    @Override
    public void dispense() {
        System.out.println("無法發放糖果");
    }
}
