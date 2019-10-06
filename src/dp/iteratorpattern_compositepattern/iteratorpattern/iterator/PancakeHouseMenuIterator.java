/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern.iterator;

import dp.iteratorpattern_compositepattern.iteratorpattern.Menu.MenuItem;
import java.util.ArrayList;

/**
 *
 * @author bill
 */
public class PancakeHouseMenuIterator implements Iterator{
    ArrayList menuItems;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList menuItems) {
        this.menuItems = menuItems;
    }
    
    @Override
    public Object next() {
        MenuItem menuItem = (MenuItem) menuItems.get(position);
        position++;
        return menuItem;
    }
    
    @Override
    public boolean hasNext() {
        return position < menuItems.size();
    }
}
