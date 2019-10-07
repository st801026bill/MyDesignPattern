/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern1;

import dp.iteratorpattern_compositepattern.iteratorpattern1.Menu.DinerMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern1.Menu.MenuItem;
import dp.iteratorpattern_compositepattern.iteratorpattern1.Menu.PancakeHouseMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern1.iterator.Iterator;

/**
 *
 * @author bill
 */
public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;
    
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }
    
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator = dinerMenu.createIterator();
        
        System.out.println("菜單\n----\n早餐");
        printMenu(pancakeIterator);
        System.out.println("午餐");
        printMenu(dinerIterator);
    }
    
    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() +","+ menuItem.getPrice() +"--"+ menuItem.getDescription());
        }
    }
            
}
