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
 * 反覆器模式 : 讓我們能夠取得一個聚集內的每一個元素，而不需要此聚集將其實件方式暴露出來
 * 利用jdk內建 java.util.Iterator 改寫程式
 */
public class TestIteratorPattern2 {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
        waitress.printMenu();
    }
}
