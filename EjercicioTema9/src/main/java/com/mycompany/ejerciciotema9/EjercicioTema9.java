
package com.mycompany.ejerciciotema9;

/**
 *
 * @author boris
 */
public class EjercicioTema9 {

    public static void main(String[] args) {
 Cliente cliente1 = new Cliente(500, 50, "Boris", 964338790);
        System.out.println("el nombre del cliente es: " + cliente1.nombre);
        System.out.println("la edad del cliente es: " + cliente1.edad);
        System.out.println("el telefono del cliente es: " + cliente1.telefono);
        System.out.println("el credito del cliente es: " + cliente1.credito);
        System.out.println("----------------------------------------------");
 
 Trabajador trabajador1 = new Trabajador(200, 25, "pedro", 945623512);
        System.out.println("el nombre de trabajador es: " + trabajador1.nombre);
        System.out.println("la edad de trabajador es: " + trabajador1.edad);
        System.out.println("el telefono de trabajador es: " + trabajador1.telefono);
        System.out.println("el salario de trabajador es: " + trabajador1.salario);
}
}