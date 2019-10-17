/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.statepattern2.state;

import dp.statepattern.statepattern2.CandyMachine;
import java.util.Random;

/**
 *
 * @author bill
 * State:已投入硬幣
 */
public class HasQuarterState implements State {
    Random randomWinner = new Random(System.currentTimeMillis());   //3.增加亂數產生贏家
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
        
        //4. 判斷是否為贏家
        int winner = randomWinner.nextInt(10);
        if((winner==0) && (candyMachine.getCount()>1)) {
            candyMachine.setState(candyMachine.getWinnerState());
        } else {
            candyMachine.setState(candyMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("無法發放糖果");
    }
}
