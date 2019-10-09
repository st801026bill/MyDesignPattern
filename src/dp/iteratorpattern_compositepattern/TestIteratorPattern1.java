/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern;

import dp.iteratorpattern_compositepattern.iteratorpattern1.Menu.DinerMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern1.Menu.PancakeHouseMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern1.Waitress;

/**
 *
 * @author bill
 * 自訂 Iterator
 */
public class TestIteratorPattern1 {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
