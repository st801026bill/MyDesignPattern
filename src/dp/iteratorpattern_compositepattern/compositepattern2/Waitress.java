/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.compositepattern2;

import dp.iteratorpattern_compositepattern.compositepattern2.Menu.MenuComponent;
import java.util.Iterator;



/**
 *
 * @author bill
 */
public class Waitress {
    MenuComponent allMenus;
    
    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }
    
    public void printMenu() {
        allMenus.print();
    }
    
    //6.
    public void printVegetarianMenu() {
        Iterator iterator = allMenus.createIterator();
        System.out.print("\n素食菜單\n----\n");
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            //只有MenuItem的print()可以被呼叫，而Menu的不行(因為會throw UnsupportedOperationException())
            try {
                if(menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException e) {
            }
        }
    } 
}
