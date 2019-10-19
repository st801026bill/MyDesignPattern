/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern.proxypattern1;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author bill
 * 實踐遠端服務
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{
    
    public MyRemoteImpl() throws RemoteException {}
    
    @Override
    public String sayHello() throws RemoteException {
        return "Server says 'Hey!'";
    }
    
    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            LocateRegistry.createRegistry(8000);
            Naming.rebind("//127.0.0.1:8000/RemoteHello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
