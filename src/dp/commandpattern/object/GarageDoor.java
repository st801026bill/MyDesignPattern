/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.commandpattern.object;

/**
 *
 * @author st801
 */
public class GarageDoor {
    String name = "";

    public GarageDoor(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println("車門: 開啟!!");
    }
    public void off() {
        System.out.println("車門: 關閉!!");
    }
}
