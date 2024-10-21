/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colalinkedlist;

import java.util.Collections;
import java.util.LinkedList;

/**
 *
 * @author pc
 */
public class Cola {
    LinkedList cola=new LinkedList();
    
    //agregar elementos a la cola. Agrega por el final
    public void enqueue(Object o){
        cola.addLast(o);
    }
     public void listarCola(){
        System.out.println("\nListando...");
        System.out.print("(inicio)");
        for (Object el : cola) 
            System.out.print(el+" ");
        System.out.print("(fin)");
    }
    //eliminar elementos de la cola. Elimina del principio
    public Object dequeue(){
        if(cola.isEmpty()){
            System.out.println("No se puede eliminar. La cola esta vacia");
            return null;
        }else
            return cola.removeFirst();
    }
     
     public void ordenar(){
        System.out.print("\n\nOrdenando...");
        Collections.sort(cola);
        listarCola();
    }
     
    public void llenarVariosElm(){
        System.out.println("Llenanando...");
        
        for(int i=0;i<4;i++)
            enqueue(i);
    }  
}
