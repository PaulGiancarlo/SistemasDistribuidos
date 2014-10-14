/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package serverrpc;

import java.rmi.RMISecurityManager;
import java.util.Scanner;

/**
 *
 * @author paul
 */
public class ClienteRPC {

    /**
     * @param args the command line arguments
     * 
     * Hay que tener en cuenta que se debe agregar permisos de ejecucion para que 
     * pueda funcionar este codigo
     * Tenemos que agregar en security.policy del jre de java(el que estas usando
     * actualmente), en mi caso el ~/jdk1.7.0_25/jre/lib/security/java.policy
     * abrimos el archivo y al final le agregamos:
     * 
     * grant codeBase "file:////home/paul/NetBeansProjects/ClienteRPC/bin/-" {
   permission java.util.PropertyPermission "*", "read,write";
 };

    * con esto podemos ejecutar nuestro codigo sin problemas de permisos
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (System.getSecurityManager()==null){
            System.setSecurityManager(new RMISecurityManager());
    }
        
    /**    
        ConsumirRemoto consumirR = new ConsumirRemoto();
        consumirR.SumarRemotamente(99, 1);
        consumirR.MultRemotamente(4, 4);
        consumirR.RaizRemotamente(9);
     */
      while(true)
        {
        	System.out.println("ingrese una opcion");
        	System.out.println("1.-	sumar");
        	
                System.out.println("2.-	multiplicar");
        	
        	System.out.println("3.-	raizCuadrada");
                System.out.println("____________________________");
                Scanner sc=new Scanner(System.in);
                ConsumirRemoto consumirR = new ConsumirRemoto();
        	int op=sc.nextInt();
        	switch(op)
        	{
                    
		        case 1:
		        	System.out.println("ingrese primer numero");
		        	int a,b;
		        	a=sc.nextInt();
		        	System.out.println("ingrese primer numero");
		        	b=sc.nextInt();
		        	
		        	consumirR.SumarRemotamente(a, b);
		        	break;
                        case 2:
                            System.out.println("ingrese primer numero");
                            int x,y;
                            x = sc.nextInt();
                            System.out.println("ingrese primer numero");
                            y = sc.nextInt();
                            
                            consumirR.MultRemotamente(x, y);
                            break;
		        case 3:
		        	System.out.println("ingrese el numero");
		        	double r;
		        	r=sc.nextDouble();
		        	
		        	consumirR.RaizRemotamente(r);
		        	break;
		        	
		        default :break;
		        	
		        	
		    }
	 }   
        
}
}