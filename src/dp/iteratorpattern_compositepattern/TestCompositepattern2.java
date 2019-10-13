/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.iteratorpattern_compositepattern;

import dp.iteratorpattern_compositepattern.compositepattern2.Menu.Menu;
import dp.iteratorpattern_compositepattern.compositepattern2.Menu.MenuComponent;
import dp.iteratorpattern_compositepattern.compositepattern2.Menu.MenuItem;
import dp.iteratorpattern_compositepattern.compositepattern2.Waitress;


/**
 *
 * @author bill
 * 合成反覆器
 * 
 */
public class TestCompositepattern2 {
    public static void main(String[] args) {
        //先建立菜單物件
        MenuComponent pancakeHouseMenu  = new Menu("早餐菜單", "早餐");
        MenuComponent dinerMenu         = new Menu("晚餐菜單", "晚餐");
        MenuComponent cafeMenu          = new Menu("咖啡菜單", "咖啡");
        MenuComponent dessertMenu       = new Menu("點心菜單", "點心");
        
        //再建立最上層菜單，稱為allMenus
        MenuComponent allMenus = new Menu("全部菜單", "菜單總覽");
        
        //使用合成節點的add()，將所有菜單都加入allMenus
        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);
        
        //加入菜單項目
        pancakeHouseMenu.add(new MenuItem("有氧煎餅早餐", "炒雞蛋煎餅+吐司",      true,   2.99));
        pancakeHouseMenu.add(new MenuItem("招牌煎餅早餐", "煎雞蛋+德國香腸",      false,  2.99));
        pancakeHouseMenu.add(new MenuItem("藍莓煎餅",     "新鮮藍莓煎餅",         true,   3.49));
        pancakeHouseMenu.add(new MenuItem("威化餅",       "威化餅(藍莓或草莓)",   true,   3.59));
        
        dinerMenu.add(new MenuItem("素食三明治",   "生菜全麥吐司",           true,   2.99));
        dinerMenu.add(new MenuItem("招牌三明治",   "培根生菜全麥吐司",       false,  2.99));
        dinerMenu.add(new MenuItem("當日湯品",     "當日湯品(附番茄沙拉)",   false,  3.29));
        dinerMenu.add(new MenuItem("熱狗",         "熱狗+大亨堡",           false,  3.05));
        
        //在菜單中加入菜單
        dinerMenu.add(dessertMenu);
        dessertMenu.add(new MenuItem("蘋果派",      "蘋果+肉桂+冰淇淋",         true,   1.59));
        dessertMenu.add(new MenuItem("起士蛋糕",    "紐約起士蛋糕+巧克力奶昔",  true,   1.99));
        dessertMenu.add(new MenuItem("炸薯條",      "炸薯條+可樂",              false, 1.89));
        
        cafeMenu.add(new MenuItem("美式冰咖啡",   "黑咖啡",           false,   3.99));
        cafeMenu.add(new MenuItem("拿鐵",         "黑咖啡 + 牛奶",    false,   3.69));
        cafeMenu.add(new MenuItem("熱可可",       "熱巧克力",         false,   2.99));
        
        //印出素食菜單  
        Waitress waitress = new Waitress(allMenus);
        waitress.printVegetarianMenu();
    }
}
