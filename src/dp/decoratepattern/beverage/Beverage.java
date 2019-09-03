/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratepattern.beverage;

/**
 *
 * @author st801
 */
public abstract class Beverage {
    String description = "未知飲料";
    
    public String getDescription() {
        return description;
    }
    
    public abstract double cost();
}
