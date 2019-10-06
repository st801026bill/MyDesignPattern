/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern.iterator;

import dp.iteratorpattern_compositepattern.iteratorpattern.Menu.MenuItem;

/**
 *
 * @author bill
 */
public class DinerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;
    
    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }
    
    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        if(position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }
}
