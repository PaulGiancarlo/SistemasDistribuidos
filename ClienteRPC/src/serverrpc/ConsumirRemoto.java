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
public class ConsumirRemoto {
    public void SumarRemotamente(int a, int b)
    {
        try {
            /**
             * podemos cambiar la direccion de localhost por la direccion de otra maquina
             * colocando la IP
             */
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",54321);
            MetodosRemotos miInterfaz = (MetodosRemotos)registro.lookup("rmiRemoto");
            int suma = miInterfaz.SumaRemota(a, b);
            System.out.println("La suma es : " +suma+"\n");
                   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    
    public void MultRemotamente(int a, int b)
    {
        {
        try {
            /**
             * podemos cambiar la direccion de localhost por la direccion de otra maquina
             * colocando la IP
             */
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",54321);
            MetodosRemotos miInterfaz = (MetodosRemotos)registro.lookup("rmiRemoto");
            int mult = miInterfaz.MultRemota(a, b);
            System.out.println("\nLa multiplicacion es : " +mult +"\n");
                   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    }
    
    public void RaizRemotamente(double a){
        {
        try {
            /**
             *  Implementamos una raiz cuadrada para nuestro RPC
             *
             */
            Registry registro = LocateRegistry.getRegistry("127.0.0.1",54321);
            MetodosRemotos miInterfaz = (MetodosRemotos)registro.lookup("rmiRemoto");
            double raiz = miInterfaz.Raiz(a);
            System.out.println("\nLa raiz  es : " +raiz +"\n");
                   
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    } 
    }
    
    
}
