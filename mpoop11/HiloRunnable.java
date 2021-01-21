/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop11;

/**
 * Clase que implementa Runnable
 * @author Leal Hernandez Haziel Ivan
 */
public class HiloRunnable implements Runnable{
    
     /**
     * Método que imprime el numero de una iteracion y el nombre del hilo que la ejecuta
     */
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion: "+i+
                    " del "+Thread.currentThread().getName()); 
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
    
}
