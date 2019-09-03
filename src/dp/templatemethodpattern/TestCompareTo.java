/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern;

import dp.templatemethodpattern.CompareTo.Duck;
import java.util.Arrays;

/**
 *
 * @author st801
 * Comparable, Comparator也是一種樣板方法!?
 */
public class TestCompareTo {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("鴨子1號", 8) {},
            new Duck("鴨子2號", 2),
            new Duck("鴨子3號", 7),
            new Duck("鴨子4號", 2),
            new Duck("鴨子5號", 10),
            new Duck("鴨子6號", 2)
        };
        
        System.out.println("排序前...");
        display(ducks);
        
        Arrays.sort(ducks);
        
        System.out.println("排序後...");
        display(ducks);
    }
    
    private static void display(Duck[] ducks) {
        for(Duck duck : ducks) {
            System.out.println(duck);
        }
    }
}
