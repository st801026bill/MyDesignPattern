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
public class Singleton3 {
    private volatile static Singleton3 singleton;
    
    private Singleton3() {}
    
    //只在第一次執行時才同步化此類別，之後singleton被實體化，就不會在執行此程式碼。
    //volatile關鍵字確保 : 當singleton變數被初使化成Singleton3使體時，多個執行緒處理singleton變數的作法是正確的。
    public static Singleton3 getInstance() {
        if(singleton == null) {
            synchronized(Singleton3.class) {
                if(singleton == null)
                    singleton = new Singleton3();
            }
        }
        return singleton;
    }
    
    public void print(){
        System.out.println("印出Singleton3");
    }
}
