/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_tema4;

/**
 *
 * @author boris
 */
import java.util.Scanner;
public class Ejercicio_Tema4 {

    public static void main(String[] args) {
       
        //Condicional If
        
        System.out.println("Condicional if else");
        
        System.out.println("ingrese un numero:");
        
        Scanner sc = new Scanner(System.in);
        int numeroIf = sc.nextInt();
        
        if(numeroIf<0){
            System.out.println(numeroIf +" es menor que cero");
        }else if(numeroIf>0){
            System.out.println(numeroIf +" es mayor que cero");
        }else{
            System.out.println(numeroIf +" es igual a cero");
        }
      
        //Bucle While
        System.out.println("bucle While");
        int numeroWhile=0;
        
        while(numeroWhile < 3){
        
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        
        }
        
        //Bucle Do While
        System.out.println("Bucle Do While");
        
        
        int numeroDoWhile = 0;
        
        
        do{
            System.out.println(numeroDoWhile);
         numeroDoWhile = numeroDoWhile + 1;
        }
        while(numeroDoWhile < 1);
        
        //Bucle For
        System.out.println("Bucle For");
        
        for(int numeroFor = 0;numeroFor <= 3; numeroFor ++){
            System.out.println(numeroFor);
        }
        
        //Condicional Switch
        
        System.out.println("Condicional Switch");
        Scanner scan = new Scanner(System.in);
        System.out.println("ingrese una estación del año");
        String estacion = scan.nextLine();
    
        switch(estacion){
            case "verano":
                System.out.println("en la estación de verano hace buen tiempo para nadar");
                 break;  
            case "primavera":
                System.out.println("en la estación de primavera es bonito salir a pasear");
                 break;
            case "otoño":
                System.out.println("en la estacion de otoño las hojas caen y hay viento");
                 break;
            case "invierno":
                System.out.println("en la estacion de invierno hay demasiada lluvia y mucho frio");
                 break;
            default:
                System.out.println("se equivocó de palabra esa no es una estación");
        
        }
        
    }
   
}
