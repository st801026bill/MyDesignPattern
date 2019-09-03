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
public class Esoresso extends Beverage{
    final double cost = 1.99;
    public Esoresso() {
        description = "濃縮咖啡";
    }
    public double cost() {
        return cost;
    }
}
