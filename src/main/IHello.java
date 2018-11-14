package main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IHello extends Remote {
  void animation() throws RemoteException;
}
