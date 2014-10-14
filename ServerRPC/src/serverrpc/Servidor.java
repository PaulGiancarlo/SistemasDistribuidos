/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrpc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author paul
 */
public class Servidor extends UnicastRemoteObject implements MetodosRemotos{
    
    public Servidor() throws RemoteException{}
    @Override
    public int SumaRemota(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int MultRemota(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public double Raiz(double a) throws RemoteException {
        return Math.sqrt(a);
    }
    
}
