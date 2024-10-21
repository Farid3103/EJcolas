
package colaObjetos;

import colalinkedlist.*;
import java.util.Scanner;

/**
 *
 * @author 4616166
 */
public class Control {
    Scanner in = new Scanner(System.in);
    Cola cola = new Cola();

    void menu() {
        int opc;
        do {
            System.out.println("-----MENU DE OPCIONES-----");
            System.out.println("1. Agregar persona a la fila");
            System.out.println("2. Ver personas en la fila");
            System.out.println("3. Atender persona");
            System.out.print("Digite una opcion: ");
            opc = in.nextInt();

            switch (opc) {
                case 1:
                    this.agregar();
                    break;
                case 2:
                    cola.listarCola();
                    System.out.println("");
                    break;
                case 3:
                    cola.dequeue();
                    break;
            }
        } while (opc > 0 & opc < 4);
    }
    
    void agregar(){
        System.out.println("AGREGAR PERSONA A LA FILA");
        System.out.print("Nombre:");
        String name=in.next();
        System.out.print("Apellido:");
        String lastname=in.next();
        System.out.print("C.C.:");
        String cc=in.next();
        
        //seteo
        Persona per=new Persona();
        per.setNombre(name);
        per.setApellido(lastname);
        per.setCc(cc);
        
        //agrego a la cola de elementos
        cola.enqueue(per);
        System.out.println("Persona agregada a la fila!!");
    }
}
