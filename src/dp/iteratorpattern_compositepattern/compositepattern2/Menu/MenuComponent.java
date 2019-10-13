/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.compositepattern2.Menu;

import java.util.Iterator;

/**
 *
 * @author bill
 */
public abstract class MenuComponent {
    //與合成節點(Menu)相關的方法，包括新增、移除、取得子節點
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }
    
    //與葉節點(MenuItem)相關的方法，但其中有些也可以用再合成節點上
    public String getName() {
        throw new UnsupportedOperationException();
    }

    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    public double getPrice() {
        throw new UnsupportedOperationException();
    }
    
    public void print() {
        throw new UnsupportedOperationException();
    }
    
    //1. 建立createIterator方法，強迫子類別繼承與實踐
    public Iterator createIterator() {
        throw new UnsupportedOperationException();
    }
}
