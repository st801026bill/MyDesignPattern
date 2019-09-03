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
public class Light {
    public String name = "";

    public Light(String name) {
        this.name = name;
    }
    
    public void on() {
        System.out.println(this.name +"電燈: 開啟!!");
    }
    public void off() {
        System.out.println(this.name +"電燈: 關閉!!");
    }
}
