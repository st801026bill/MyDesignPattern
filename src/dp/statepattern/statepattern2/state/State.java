/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.statepattern.statepattern2.state;

/**
 *
 * @author bill
 */
public interface State {
   //投入25分錢
   public void insertQuarter();
   //退出25分錢
   public void ejectQuarter();
   //轉動轉軸
   public void turnCrank();
   //發放糖果
   public void dispense();
}
