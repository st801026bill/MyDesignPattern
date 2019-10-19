/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.compoundpattern.compoundpattern3;

import dp.compoundpattern.compoundpattern3.Duck.Quackable;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bill
 */
public class Flock implements Quackable{
    ArrayList quackers = new ArrayList();
    
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    
    @Override
    public void quack() {
        Iterator iterator =  quackers.iterator();
        while(iterator.hasNext()) {
            Quackable quacker = (Quackable)iterator.next();
            quacker.quack();
        }
    }
    
}
