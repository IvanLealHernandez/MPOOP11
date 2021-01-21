/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpoop11;

/**
 * Clase principal para probar el manejo de hilos
 * @author Leal Hernandez Haziel Ivan
 */
public class MPOOP11 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creacion del primer hilo
        HiloThread hilo1 = new HiloThread("Primer hilo");
        //Inicio de primer hilo
        hilo1.start();
        //Creación e inicio del segundo hilo
        new HiloThread("Segundo hilo").start();
        System.out.println("Termina el hilo principal");
        
        //Creación e inicio del tercer y cuarto hilo con la clase Runnable
        new Thread(new HiloRunnable(), "Tercer hilo").start();
        new Thread(new HiloRunnable(), "Cuarto hilo").start();

    }

}
