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
public class Stereo {
    String name = "";
    String CD = "";
    int volume = 0;

    public Stereo(String name) {
        this.name = name;
    }

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    
    public void on() {
        System.out.println("立體聲: 開啟!!");
    }
    public void off() {
        System.out.println("立體聲: 關閉!!");
    }
}
