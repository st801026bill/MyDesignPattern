/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.adapterpattern;

/**
 *
 * @author st801
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("咯咯叫");
    }

    @Override
    public void fly() {
        System.out.println("我在短短的飛");
    }
    
}
