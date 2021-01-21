/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupos;

/**
 * Clase que hereda de Thread
 * @author Leal Hernandez Haziel Ivan
 */
public class HiloDeGrupo extends Thread {
    
     /**
     * Constructor que recibe como parametro un grupo de hilos y un nombre
     * @param name
     * @param group
     */
    public HiloDeGrupo(ThreadGroup group, String name) {
        super(group, name);
    }
    
     /**
     * Método run sobreeescrito que imprime un numero de iteración y el nombre del hilo que la ejecuta
     */
    @Override
    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Iteracion "+i+" de "+getName());
            
        }
    }
    
}
