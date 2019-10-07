/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern2.iterator;

import dp.iteratorpattern_compositepattern.iteratorpattern2.Menu.MenuItem;
import java.util.Iterator;

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
    
    //2. 改成 import java.util.Iterator; 並實踐remove()方法
    @Override
    public void remove() {
        if(position <= 0)
            throw new IllegalStateException("無法執行remove()，請確認至少要一筆資料");
        if(items[position-1] != null) {
            for(int i=position-1; i<items.length-1; i++) {
                items[i] = items[i+1];
            }
            items[items.length-1] = null;
        }
    }
}
