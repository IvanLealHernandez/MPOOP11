/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author Leal Hernandez Haziel Ivan
 */
public class Main {
    
     public static void main(String[] args){
         
        //Creación e iicio de objetos de la clase Cuenta
        new Cuenta("Acceso1").start();
        new Cuenta("Acceso2").start();
        new Cuenta("Deposito1").start();
        new Cuenta("Deposito2").start();
        System.out.println("Termina el hilo principal");
    }
    
}
