package com.justted.chapter18;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote{

    public MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try{
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("rmi://127.0.0.1/Hello", service);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
