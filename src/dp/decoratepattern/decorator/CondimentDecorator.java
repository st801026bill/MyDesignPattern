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
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
