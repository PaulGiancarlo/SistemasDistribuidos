/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrpc;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author paul
 */
public interface   MetodosRemotos extends Remote{
    
    /**
     Aqui podemos agregar todos los metodos que queramos
     */
    
    public int SumaRemota(int a, int b) throws RemoteException;
    public int MultRemota(int  a, int  b) throws RemoteException;
    public double Raiz(double a) throws RemoteException;
}