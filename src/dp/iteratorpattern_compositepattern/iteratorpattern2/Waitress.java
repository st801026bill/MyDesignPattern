/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern2;

import dp.iteratorpattern_compositepattern.iteratorpattern2.Menu.Menu;
import dp.iteratorpattern_compositepattern.iteratorpattern2.Menu.MenuItem;
import java.util.Iterator;

/**
 *
 * @author bill
 */
public class Waitress {
    //4. 將具象的菜單類別改為抽象的Menu介面
//    PancakeHouseMenu pancakeHouseMenu;
//    DinerMenu dinerMenu;
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
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
