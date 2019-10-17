/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern;

import dp.statepattern.statepattern2.CandyMachine;

/**
 *
 * @author bill
 */
public class TestStatePattern2 {
    public static void main(String[] args) {
        CandyMachine candyMachine = new CandyMachine(100);
        
        System.out.println("---1.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        System.out.println("---2.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.ejectQuarter();
        candyMachine.turnCrank();
        System.out.println("---3.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.ejectQuarter();
        System.out.println("---4.剩餘糖果個數:"+ candyMachine.getCount());
        candyMachine.insertQuarter();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        candyMachine.insertQuarter();
        candyMachine.turnCrank();
        System.out.println("---5.剩餘糖果個數:"+ candyMachine.getCount());
    }   
}
