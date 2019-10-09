/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern3.Menu;

import java.util.Hashtable;
import java.util.Iterator;

/**
 *
 * @author bill
 * 增加 CafeMenu 類別及反覆器
 */
public class CafeMenu implements Menu {
    Hashtable menuItems = new Hashtable();
    
    public CafeMenu() {
        addItem("美式冰咖啡",   "黑咖啡",           false,   3.99);
        addItem("拿鐵",         "黑咖啡 + 牛奶",    false,   3.69);
        addItem("熱可可",       "熱巧克力",         false,   2.99);
    }
    
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.put(menuItem.getName(), menuItem);
    }
    
//    public Hashtable getItems() {
//        return menuItems;
//    }

    @Override
    public Iterator createIterator() {
        return menuItems.values().iterator();   //取得Hashtable的反覆器
    }
}
