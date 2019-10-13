/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.compositepattern2.iterator;

import dp.iteratorpattern_compositepattern.compositepattern2.Menu.Menu;
import dp.iteratorpattern_compositepattern.compositepattern2.Menu.MenuComponent;
import java.util.Iterator;
import java.util.Stack;

/**
 *
 * @author bill
 * 4.困難!!!利用遞迴建立合成反覆器
 */
public class CompositeIterator implements Iterator {
    Stack stack = new Stack();
    
    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if(stack.empty())
            return false;
        
        Iterator iterator = (Iterator) stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        if(!hasNext())
            return null;
        
        Iterator iterator = (Iterator) stack.peek();
        MenuComponent component = (MenuComponent) iterator.next();
        if(component instanceof Menu) {
            stack.push(component.createIterator());
        }
        return component;
    }

    @Override
    public void remove() {
        Iterator.super.remove(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
