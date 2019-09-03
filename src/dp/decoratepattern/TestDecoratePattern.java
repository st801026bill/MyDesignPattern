/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.decoratepattern;

import dp.decoratepattern.beverage.Beverage;
import dp.decoratepattern.beverage.DarkRoast;
import dp.decoratepattern.beverage.Esoresso;
import dp.decoratepattern.beverage.HouseBlend;
import dp.decoratepattern.decorator.Mocha;
import dp.decoratepattern.decorator.Soy;
import dp.decoratepattern.decorator.Whip;

/**
 *
 * @author st801
 */
public class TestDecoratePattern {
    public static void main(String[] args) {
        //濃縮咖啡(不加料)
        Beverage esoresso = new Esoresso();
        System.out.println(esoresso.getDescription() +" $"+ esoresso.cost());
        
        //深度烘焙咖啡(雙倍摩卡、奶泡)
        Beverage darkroast = new DarkRoast();
        darkroast = new Mocha(darkroast);
        darkroast = new Mocha(darkroast);
        darkroast = new Whip(darkroast);
        System.out.println(darkroast.getDescription() +" $"+ darkroast.cost());
        
        //特調咖啡(雙倍摩卡、奶泡)
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Soy(houseBlend);
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() +" $"+ houseBlend.cost());
    }        
}
