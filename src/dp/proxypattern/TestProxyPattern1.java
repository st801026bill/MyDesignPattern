/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp.proxypattern;

import dp.proxypattern.proxypattern1.MyRemote;
import dp.proxypattern.proxypattern1.MyRemoteImpl;
import java.rmi.Naming;

/**
 *
 * @author bill
 */
public class TestProxyPattern1 {
    public static void main(String[] args) {
        MyRemoteImpl.main(args);    //先啟動Server
        new TestProxyPattern1().go();
    }
    
    public void go() {
        try {
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1:8000/RemoteHello");
            String s = service.sayHello();
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
                    
        }
    }
}
