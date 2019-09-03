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
public class Projector {
    public void on() {
        System.out.println("啟動投影機...");
    }
    
    public void wideScreenMode() {
        System.out.println("投影機 - 寬螢幕模式");
    }
    
    public void off() {
        System.out.println("關閉投影機...");
    }
}
