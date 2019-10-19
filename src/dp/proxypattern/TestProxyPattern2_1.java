/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern;

import dp.proxypattern.proxypattern2.CandyMachine;
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.util.Scanner;

/**
 *
 * @author bill
 * 代理人模式(Server):
 */
public class TestProxyPattern2_1 {
    public static void main(String[] args) {
        CandyMachine candyMachine = null;
        int count = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入糖果機的IP與糖果個數:(127.0.0.1 100)");
        String input = sc.nextLine();
        args = new String[]{input.split(" ")[0], input.split(" ")[1]};
        
        if(args.length < 2) {
            System.out.println("參數有誤:[IP][糖果個數]");
            System.exit(1);
        }
        
        try {
            count = Integer.parseInt(args[1]);
            candyMachine = new CandyMachine(args[0], count);
            LocateRegistry.createRegistry(8000);
            Naming.rebind("//"+ args[0] +":8000/candymachine", candyMachine);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
