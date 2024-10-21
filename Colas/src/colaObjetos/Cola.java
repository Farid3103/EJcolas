/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colaObjetos;

import colalinkedlist.*;
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
         Persona persona;
        System.out.println("\nListando...");
        System.out.println("(inicio)");
        System.out.println("NOMBRE / APELLIDO / CC");
        
        for (Object el : cola){
            persona=(Persona) el;
            System.out.println(persona.getNombre()+" "+persona.getApellido()+"/"+persona.getCc());
        }    
        System.out.print("(fin)");
    }
    //eliminar elementos de la cola. Elimina del principio
    public void dequeue(){
        Persona personaAtendida;
        if(cola.isEmpty())
            System.out.println("No se puede eliminar. La cola esta vacia");
        else{
             personaAtendida=(Persona) cola.removeFirst();
             System.out.println("Atendiendo al #CC: "+personaAtendida.getCc());
        }
    }
     
     public void ordenar(){
        System.out.print("\n\nOrdenando...");
        Collections.sort(cola);
        listarCola();
    }
     
   
}
