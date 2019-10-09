/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern;

import dp.iteratorpattern_compositepattern.iteratorpattern3.Menu.CafeMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern3.Menu.DinerMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern3.Menu.PancakeHouseMenu;
import dp.iteratorpattern_compositepattern.iteratorpattern3.Waitress;

/**
 *
 * @author bill
 * 增加第三種菜單 : CafeMenu
 */
public class TestIteratorPattern3 {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        CafeMenu  cafeMenu = new CafeMenu();
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, cafeMenu);
        waitress.printMenu();
    }
}
