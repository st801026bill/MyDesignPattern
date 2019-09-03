/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.templatemethodpattern.CompareTo;

/**
 *
 * @author st801
 */
public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    @Override
    public String toString() {
        return name +" weights "+ weight;
    }
    
    @Override
    public int compareTo(Duck otherDuck) {
        if(this.weight < otherDuck.weight) {
            return -1;
        } else if(this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
    
}
