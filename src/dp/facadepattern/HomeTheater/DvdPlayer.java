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
public class DvdPlayer {
    public void on() {
        System.out.println("啟動DVD撥放器...");
    }
    
    public void play(String movie) {
        System.out.println("開始撥放: "+ movie);
    }
    
    public void stop() {
        System.out.println("DVD撥放器 - 停止");
    }
    
    public void eject() {
        System.out.println("DVD撥放器 - 退出DVD");
    }
    
    public void off() {
        System.out.println("關閉DVD撥放器...");
    }
}
