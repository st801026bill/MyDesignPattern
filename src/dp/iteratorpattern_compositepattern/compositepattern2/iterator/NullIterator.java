/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.compositepattern2.iterator;

import java.util.Iterator;

/**
 *
 * @author bill
 * 5.實做一個空反覆器(NullIterator)，作用是讓MenuItem的createIterator()"沒作用"
 */
public class NullIterator implements Iterator {

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
    
    
}
