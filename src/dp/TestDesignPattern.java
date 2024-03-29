/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp;

import dp.adapterpattern.TestAdapterPattern;
import dp.commandpattern.TestCommandPattern1;
import dp.commandpattern.TestCommandPattern2;
import dp.commandpattern.TestCommandPattern3;
import dp.commandpattern.TestCommandPattern4;
import dp.compoundpattern.TestCompoundPattern1;
import dp.compoundpattern.TestCompoundPattern2;
import dp.compoundpattern.TestCompoundPattern3;
import dp.compoundpattern.TestCompoundPattern4;
import dp.decoratepattern.TestDecoratePattern;
import dp.facadepattern.TestFacadePattern;
import dp.factorypattern.TestFactoryPatternByAbsFactory;
import dp.factorypattern.TestFactoryPatternByFactory;
import dp.factorypattern.TestFactoryPatternBySimple;
import dp.iteratorpattern_compositepattern.TestCompositepattern1;
import dp.iteratorpattern_compositepattern.TestCompositepattern2;
import dp.iteratorpattern_compositepattern.TestIteratorPattern1;
import dp.iteratorpattern_compositepattern.TestIteratorPattern2;
import dp.iteratorpattern_compositepattern.TestIteratorPattern3;
import dp.observerpattern.TestObserverPatternByCustom;
import dp.observerpattern.TestObserverPatternByJava;
import dp.proxypattern.TestProxyPattern1;
import dp.proxypattern.TestProxyPattern2_1;
import dp.proxypattern.TestProxyPattern2_2;
import dp.singletonpattern.TestSingletonPattern;
import dp.statepattern.TestStatePattern1;
import dp.statepattern.TestStatePattern2;
import dp.strategypattern.TestStrategyPattern;
import dp.templatemethodpattern.TestCompareTo;
import dp.templatemethodpattern.TestTemplateMethodPattern;
import dp.templatemethodpattern.TestTemplateMethodPatternWithHook;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author st801
 */
public class TestDesignPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("========================================");
            System.out.println("  0:跳出");
            System.out.println("  1:策略模式");
            System.out.println(" 2A:觀察者模式(自訂), 2B:觀察者模式(java)");
            System.out.println("  3:裝飾者模式");
            System.out.println(" 4A:工廠模式(簡單工廠), 4B:工廠模式(一), 4C:工廠模式(二)");
            System.out.println("  5:單利模式");
            System.out.println(" 6A:命令模式1, 6B:命令模式(2種命令), 6C:命令模式(多種命令), 6D:巨集命令");
            System.out.println("  7:轉接器模式");
            System.out.println("  8:表象模式");
            System.out.println(" 9A:樣板方法模式, 9B:樣板方法模式(Hook), 9C:樣板方法模式(CompareTo!?)");
            System.out.println("10A:反覆器模式(自訂), 10B:反覆器模式(import jdk), 10C:反覆器模式(Hashtable iterator), 10D:合成模式(基本樹狀結構), 10E:合成反覆器(重要!!10E)");
            System.out.println("11A:狀態模式(基本), 11B:狀態模式(加入新狀態)");
            System.out.println("12A:代理人模式(基本), 12B:代理人模式(Server), 12C:代理人模式(Client)");
            System.out.println("13A:複合模式(step1), 13B:複合模式(step2), 13C複合模式(step3), 13D複合模式(step3)");
            System.out.print("請輸入代號:");
            String mode = sc.nextLine();
            System.out.println("----------------------------------------");
            switch(mode) {
                case "1":   TestStrategyPattern.main(args);
                    break;
                case "2A":  TestObserverPatternByCustom.main(args); 
                    break;
                case "2B":  TestObserverPatternByJava.main(args); 
                    break;
                case "3":   TestDecoratePattern.main(args); 
                    break;
                case "4A":  TestFactoryPatternBySimple.main(args); 
                    break;
                case "4B":  TestFactoryPatternByFactory.main(args); 
                    break;
                case "4C":  TestFactoryPatternByAbsFactory.main(args); 
                    break;
                case "5":   TestSingletonPattern.main(args); 
                    break;
                case "6A":  TestCommandPattern1.main(args); 
                    break;
                case "6B":  TestCommandPattern2.main(args); 
                    break;
                case "6C":  TestCommandPattern3.main(args); 
                    break;
                case "6D":  TestCommandPattern4.main(args);
                    break;
                case "7":   TestAdapterPattern.main(args); 
                    break;
                case "8":   TestFacadePattern.main(args); 
                    break;
                case "9A":  TestTemplateMethodPattern.main(args); 
                    break;
                case "9B":  TestTemplateMethodPatternWithHook.main(args); 
                    break;        
                case "9C":  TestCompareTo.main(args);
                    break;    
                case "10A": TestIteratorPattern1.main(args);
                    break;
                case "10B": TestIteratorPattern2.main(args);
                    break;
                case "10C": TestIteratorPattern3.main(args);
                    break;
                case "10D": TestCompositepattern1.main(args);
                    break;
                case "10E": TestCompositepattern2.main(args);
                    break;
                case "11A": TestStatePattern1.main(args);
                    break;
                case "11B": TestStatePattern2.main(args);
                    break;
                case "12A": TestProxyPattern1.main(args);
                    break;
                case "12B": TestProxyPattern2_1.main(args);
                    break;
                case "12C": TestProxyPattern2_2.main(args);
                    break;
                case "13A": TestCompoundPattern1.main(args);
                    break;
                case "13B": TestCompoundPattern2.main(args);
                    break;
                case "13C": TestCompoundPattern3.main(args);
                    break;
                case "13D": TestCompoundPattern4.main(args);
                    break;
                case "0":
                    return;
            }
        }
    }
}
