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
public class Singleton1 {
    private static Singleton1 singleton;
    private Singleton1() {}
    
    //BUG!! : 若在多執行緒下執行，可能會產生2個singleton
    public static Singleton1 getInstance() {
        if(singleton == null){
            singleton = new Singleton1();
        }
        return singleton;
    }
    
    public void print(){
        System.out.println("印出Singleton1");
    }
}
