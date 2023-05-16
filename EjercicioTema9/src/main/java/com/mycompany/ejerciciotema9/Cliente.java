
package com.mycompany.ejerciciotema9;

/**
 *
 * @author boris
 */
public class Cliente extends Persona{
   public long credito;

    public Cliente(long credito, int edad, String nombre, int telefono) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public long getCredito() {
        return credito;
    }

    public void setCredito(long credito) {
        this.credito = credito;
    }




    
 

 
    
}
