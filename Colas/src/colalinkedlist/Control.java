/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colalinkedlist;

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
            System.out.println("1. Agregar elemento a la fila");
            System.out.println("2. Listar Elementos");
            System.out.println("3. Eliminar elemento de la fila");
            System.out.println("Digite una opcion: ");
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
                    System.out.println("Dato eliminado de la fila"
                            + cola.dequeue());
                    break;
            }
        } while (opc > 0 & opc < 4);
    }
    
    void agregar(){
        System.out.println("Digite el dato a agregar a la fila");
        String datoRegistrar=in.next();
        cola.enqueue(datoRegistrar);
        System.out.println("Dato agregado a la fila!!!");
    }
}
