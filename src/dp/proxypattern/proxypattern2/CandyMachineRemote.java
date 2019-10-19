/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern.proxypattern2;

import dp.proxypattern.proxypattern2.state.State;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author bill
 */
public interface CandyMachineRemote extends Remote {
    public int getCount() throws RemoteException;
    public String getLocation() throws RemoteException;
    public State getState() throws RemoteException;
}
