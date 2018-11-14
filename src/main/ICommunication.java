package main;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICommunication extends Remote {
  void setMessage(byte[] message) throws RemoteException;

}
