/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern;

import dp.proxypattern.proxypattern2.CandyMonitor;
import dp.proxypattern.proxypattern2.CandyMachineRemote;
import java.rmi.Naming;

/**
 *
 * @author bill
 * 代理人模式(Client):
 */
public class TestProxyPattern2_2 {
    public static void main(String[] args) {
        String[] locations = {
//            "rmi://192.168.163.166:8000/candymachine",
//            "rmi://192.168.163.166:8000/candymachine",
//            "rmi://192.168.163.166:800012B/candymachine"
            "rmi://127.0.0.1:8000/candymachine"
        };
                
        CandyMonitor[] monitors = new CandyMonitor[locations.length];
        
        for(String location : locations) {
            try {
                int i =0;
                CandyMachineRemote machine = (CandyMachineRemote) Naming.lookup(location);
                monitors[i] = new CandyMonitor(machine);
                i++;
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        
        for(CandyMonitor monitor : monitors) {
            monitor.report();
        }
    }
}
