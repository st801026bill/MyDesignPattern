/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratepattern.decorator;

import dp.decoratepattern.beverage.Beverage;

/**
 *
 * @author st801
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;
    final double cost = 0.15;
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }
    
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 豆漿";
    }
    
    public double cost() {
        return this.cost + beverage.cost();
    }
    
}
