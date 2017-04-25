package com.justted.chapter18;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Justted on 2017/3/13.
 */
public interface ServiceServer extends Remote {
    Object[] getServiceList() throws RemoteException;
    Service getService(Object serviceKey) throws RemoteException;
}
