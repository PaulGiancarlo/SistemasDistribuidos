/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrpc;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author paul
 */
public class ServerRPC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
            Registry regsitro  = LocateRegistry.createRegistry(54321);
            regsitro.rebind("rmiRemoto", new Servidor()); //mantiene el servidor en modo de escucha
            System.out.println("Servidor activo :");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
