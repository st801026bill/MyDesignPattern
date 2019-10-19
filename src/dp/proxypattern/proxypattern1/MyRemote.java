/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern.proxypattern1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author bill
 * 遠端介面
 */
public interface MyRemote extends Remote{
    public String sayHello() throws RemoteException;
}
