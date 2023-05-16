
package com.mycompany.ejerciciotema9;

/**
 *
 * @author boris
 */
public class Trabajador extends Persona {
    public int salario;
    
    public Trabajador(int salario, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    
}
