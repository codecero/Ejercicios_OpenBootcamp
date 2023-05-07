

package com.mycompany.funcionsuma;

/**
 *
 * @author boris
 */
import java.util.Scanner;
public class FuncionSuma {
    public static int suma(int num1, int num2, int num3){
        int resultado;
        resultado = num1 + num2 + num3;
        return resultado;
    }
       public static void main(String[] args) {
    
         
         Scanner sc=new Scanner(System.in);
         System.out.println("ingrese el primer numero para sumar");
         int num1 = sc.nextInt();
         
         System.out.println("ingrese el segundo numero para sumar");
         int num2 = sc.nextInt();
         
         System.out.println("ingrese el tercer numero para sumar");
         int num3 = sc.nextInt();
         
        int resultado = suma(num1,num2,num3);    
         System.out.println("el resultado de la suma es: " + resultado); 
        }
    
}

 
