/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern2.Goose;

import dp.compoundpattern.compoundpattern2.Duck.Quackable;

/**
 *
 * @author bill
 */
public class GooseAdapter implements Quackable {
    Goose goose;
    
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    
    @Override
    public void quack() {
        goose.honk();
    }
}
