package com.justted.chapter18;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Justted on 2017/3/9.
 */
public interface MyRemote extends Remote {
    String sayHello() throws RemoteException;
}
