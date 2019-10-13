/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern.compositepattern2.Menu;

import dp.iteratorpattern_compositepattern.compositepattern2.iterator.NullIterator;
import java.util.Iterator;

/**
 *
 * @author bill
 */
public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private boolean vegetarian;
    private double price;
    
    //菜單名稱、簡介、是否為素食、價格
    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
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
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }
    
    @Override
    public void print() {
        System.out.print(" "+ getName());
        if(isVegetarian())
            System.out.print("(v)");
        System.out.print(", "+ getPrice());
        System.out.println(" -- "+ getDescription());
    }

    //3.回傳NullIterator!?
    @Override
    public Iterator createIterator() {
        return new NullIterator();
    }
    
    
}
