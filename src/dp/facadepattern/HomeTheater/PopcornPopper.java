/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.facadepattern.HomeTheater;

/**
 *
 * @author st801
 */
public class PopcornPopper {
    public void on() {
        System.out.println("啟動爆米花機");
    }
    
    public void pop() {
        System.out.println("爆米花機 - 開始爆爆米花");
    }
    
    public void off() {
        System.out.println("關閉爆米花機");
    }
}
