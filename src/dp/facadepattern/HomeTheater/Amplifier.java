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
public class Amplifier {
    public void on() {
        System.out.println("啟動擴大機...");
    }
    
    public void setDvd(DvdPlayer dvd) {
        System.out.println("擴大機 - 啟用dvd");
    }
    
    public void setSurroundSound() {
        System.out.println("擴大機 - 啟用環繞音效");
    }
    
    public void setVolune(int volume) {
        System.out.println("擴大機 - 設定音量:"+ volume);
    }
    
    public void off() {
        System.out.println("關閉擴大機...");
    }
}
