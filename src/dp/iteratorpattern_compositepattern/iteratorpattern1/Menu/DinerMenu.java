/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern1.Menu;

import dp.iteratorpattern_compositepattern.iteratorpattern1.Menu.MenuItem;
import dp.iteratorpattern_compositepattern.iteratorpattern1.iterator.DinerMenuIterator;
import dp.iteratorpattern_compositepattern.iteratorpattern1.iterator.Iterator;

/**
 *
 * @author bill
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("素食三明治",   "生菜全麥吐司",           true,   2.99);
        addItem("招牌三明治",   "培根生菜全麥吐司",       false,  2.99);
        addItem("當日湯品",     "當日湯品(附番茄沙拉)",   false,  3.29);
        addItem("熱狗",         "熱狗+大亨堡",           false,  3.05);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if(numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");           
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    
//    public MenuItem[] getMenuItems() {
//        return menuItems;
//    }
    
    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
