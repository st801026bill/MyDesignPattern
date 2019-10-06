/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern.Menu;

import dp.iteratorpattern_compositepattern.iteratorpattern.iterator.Iterator;
import dp.iteratorpattern_compositepattern.iteratorpattern.iterator.PancakeHouseMenuIterator;
import java.util.ArrayList;

/**
 *
 * @author bill
 */
public class PancakeHouseMenu {
    ArrayList menuItems;
    
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        
        addItem("有氧煎餅早餐", "炒雞蛋煎餅+吐司",      true,   2.99);
        addItem("招牌煎餅早餐", "煎雞蛋+德國香腸",      false,  2.99);
        addItem("藍莓煎餅",     "新鮮藍莓煎餅",         true,   3.49);
        addItem("威化餅",       "威化餅(藍莓或草莓)",   true,   3.59);        
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    
//    public ArrayList getMenuItems() {
//        return menuItems;
//    }
    
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}
