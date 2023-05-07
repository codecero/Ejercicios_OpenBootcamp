
package com.mycompany.clasecoche;

import java.util.Scanner;

/**
 *
 * @author Boris Rojas
 */
public class Coche {
    //atributos
    public int puertas;
    
    //constructor con parametros
    public Coche(int puertas) {
        this.puertas = puertas;
    }

    //metodo aumentar puertas
    Scanner sc=new Scanner(System.in);
    public void aumentaPuertas(){
        System.out.println("ingrese cantidad de puertas para agregar");
        puertas =(puertas+sc.nextInt());
        System.out.println("ahora el coche tiene: "+ puertas+" puertas");
    }
    
}
