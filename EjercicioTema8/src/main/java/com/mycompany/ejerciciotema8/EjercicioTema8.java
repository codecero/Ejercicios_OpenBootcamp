/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciotema8;

/**
 *
 * @author boris
 */
public class EjercicioTema8 {

    public static void main(String[] args) {
        
 Persona persona1 = new Persona();
    
    persona1.setEdad(42);
    persona1.setNombre("Boris");
    persona1.setTelefono(964338790);
    
    System.out.println("persona1 tiene: " + persona1.getEdad() + " años, su nombre es: " + persona1.getNombre() + " y su numero de telefono es: " + persona1.getTelefono());
   
    }
}
