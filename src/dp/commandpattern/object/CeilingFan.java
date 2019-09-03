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
public class CeilingFan {
    public enum LEVEL {HIGH, MEDIUM, LOW, OFF};
    String name;
    LEVEL level;

    public CeilingFan(String name) {
        this.name = name;
    }
    
    public void high() {
        System.out.println(this.name +"風扇: 強!!");
        level = LEVEL.HIGH;
    }
    
    public void medium() {
        System.out.println(this.name +"風扇: 中!!");
        level = LEVEL.MEDIUM;
    }
    
    public void low() {
        System.out.println(this.name +"風扇: 弱!!");
        level = LEVEL.LOW;
    }
    
    public void off() {
        System.out.println(this.name +"風扇: 關閉!!");
        level = LEVEL.OFF;
    }
    
    public LEVEL getSpeed() {
        return level;
    }
}
