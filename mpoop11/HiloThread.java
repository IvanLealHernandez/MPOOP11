/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop11;

/**
 * Clase que extiende de Thread
 * @author Leal Hernandez Haziel Ivan
 */
public class HiloThread extends Thread {
    
     /**
     * Constructor que recibe un nombre
     * @param nombre
     */
    public HiloThread(String nombre) {
        super(nombre);
    }

     /**
     * Método run sobreescrito que imprime el numero de iteracion y el nombre del hilo que la ejecuta
     *
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Iteracion: " + i + " del " + getName());
        }
        System.out.println("Termina el " + getName());
    }

}
