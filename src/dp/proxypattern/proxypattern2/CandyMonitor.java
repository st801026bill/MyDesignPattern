/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern.proxypattern2;

import java.rmi.RemoteException;

/**
 *
 * @author bill
 */
public class CandyMonitor {
    CandyMachineRemote machine;
    
    public CandyMonitor(CandyMachineRemote machine) {
        this.machine = machine;
    }
    
    public void report() {
        try {
            System.out.println("糖果機:             "+ machine.getLocation());
            System.out.println("Current inventory:  "+ machine.getCount() +" 顆糖果");
            System.out.println("Current state:      "+ machine.getState());
        } catch(RemoteException e) {
            e.printStackTrace();
        }
    }
}
