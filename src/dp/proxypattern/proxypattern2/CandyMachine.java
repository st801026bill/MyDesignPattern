/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern.proxypattern2;

import dp.proxypattern.proxypattern2.state.State;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author bill
 */
public class CandyMachine extends UnicastRemoteObject implements CandyMachineRemote{
    //記錄所有的狀態
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;  //1. 增加winnerState狀態
    
    State state = soldOutState; //預設是沒有裝糖果的
    String location = "";
    int count = 0;  //記錄裝有多少顆糖果，預設是沒有的
    
    public CandyMachine(String location, int count) throws RemoteException{
        this.location = location;
        this.count = count;
    }

    @Override
    public int getCount() throws RemoteException {
        return count;
    }

    @Override
    public String getLocation() throws RemoteException {
        return location;
    }

    @Override
    public State getState() throws RemoteException {
        return state;
    }
    
    public void setState(State state) {
        this.state = state;
    }
    
    public void releaseBall() {
        System.out.println("糖果釋出，請稍候...");
        if(count != 0) {
            count--;
        }
    }
    
    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }
}
