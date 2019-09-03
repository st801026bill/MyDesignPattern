/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.singletonpattern;

/**
 *
 * @author st801
 */
public class Singleton2 {
    private static Singleton2 singleton;
    private Singleton2() {}
    
    //增加"synchronized"到getInstance()中，配使執行續在執行此方法前，要先等待其他執行緒先離開 -> 不會同時有兩個執行緒同時執行此方法。
    //缺點: 每次執行getInstance()，都會同步化此方法 -> 造成效能降低。(應該只要第一次同步化即可)
    public static synchronized Singleton2 getInstance() {
        if(singleton == null){
            singleton = new Singleton2();
        }
        return singleton;
    }
    
    public void print(){
        System.out.println("印出Singleton2");
    }
}
