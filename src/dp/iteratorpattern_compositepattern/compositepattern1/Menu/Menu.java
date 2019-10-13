/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.compositepattern1.Menu;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author bill
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    
    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    @Override
    public void add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }
    
    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return (MenuComponent)menuComponents.get(i);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void print() {
        System.out.print("\n"+ getName());
        System.out.println(", "+ getDescription());
        System.out.println("--------------------");
        
        //!!重要:呼叫菜單底下子菜單或菜單項目的print()
        Iterator iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = (MenuComponent)iterator.next();
            menuComponent.print();
        }
    }
    
    
}
