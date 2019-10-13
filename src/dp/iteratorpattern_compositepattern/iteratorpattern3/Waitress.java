/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.iteratorpattern3;


import dp.iteratorpattern_compositepattern.iteratorpattern3.Menu.Menu;
import dp.iteratorpattern_compositepattern.iteratorpattern3.Menu.MenuItem;
import java.util.Iterator;

/**
 *
 * @author bill
 * //增加 cafeMenu 及 反覆器 cafeIterator
 */
public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;
    Menu cafeMenu;
    
    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu, Menu cafeMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
        this.cafeMenu = cafeMenu;
    }
    
    public void printMenu() {
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinerIterator   = dinerMenu.createIterator();
        Iterator cafeIterator    = cafeMenu.createIterator();
        
        System.out.println("菜單\n----\n早餐");
        printMenu(pancakeIterator);
        System.out.println("晚餐");
        printMenu(dinerIterator);
        System.out.println("咖啡");
        printMenu(cafeIterator);
    }
    
    public void printMenu(Iterator iterator) {
        while(iterator.hasNext()) {
            MenuItem menuItem = (MenuItem)iterator.next();
            System.out.println(menuItem.getName() +","+ menuItem.getPrice() +"--"+ menuItem.getDescription());
        }
    }
            
}
