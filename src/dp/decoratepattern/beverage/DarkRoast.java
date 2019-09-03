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
public class DarkRoast extends Beverage{
    final double cost = 0.99;
    public DarkRoast() {
        description = "深度烘焙咖啡";
    }
    public double cost() {
        return cost;
    }
}
